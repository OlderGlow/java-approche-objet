package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/julienpicquet/IdeaProjects/approche-objet/TP Gestion des Fichiers/src/fichier/recensement.csv");
        Path newPath = Paths.get("/Users/julienpicquet/IdeaProjects/approche-objet/TP Gestion des Fichiers/src/fichier/recensement2.csv");

        // Générer un nouveau fichier recensement2.csv en utilisant le contenu du fichier recensement.csv ne contenant que les villes de plus de 25000 habitants en ne prenant pas la première ligne

        Scanner scanner = new Scanner(Files.newBufferedReader(path));
        String empty = "";
        Files.write(newPath, (empty.getBytes()), StandardOpenOption.TRUNCATE_EXISTING);
        int nbLignes = 0;
        while (scanner.hasNextLine()) {
            nbLignes++;
            String ligne = scanner.nextLine();
            if (nbLignes == 1) {
                String[] colonnesInformations = ligne.split(";");
                Files.write(newPath, (colonnesInformations[2] + ";" + colonnesInformations[6] + ";" + colonnesInformations[9] + "\n").getBytes(), StandardOpenOption.CREATE);
                continue;
            }
            String[] colonnes = ligne.split(";");
            String nom = colonnes[6];
            String codeDepartement = colonnes[2];
            String populationTotale = colonnes[9];
            // Si la population totale est > 25000 alors afficher la ligne ne comprenant que les colonnes nom, code département et population totale
            if (Integer.parseInt(populationTotale.trim().replaceAll(" ", "")) > 25000) {
                Files.write(newPath, (nom + ";" + codeDepartement + ";" + populationTotale + "\n").getBytes(), StandardOpenOption.APPEND);
            }
        }
        System.out.println("Le fichier " + newPath.getFileName() + " a été crée !");
        scanner.close();

    }
}
