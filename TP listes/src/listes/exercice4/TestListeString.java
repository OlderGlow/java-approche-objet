package listes.exercice4;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<String>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");
        // Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
        int max = 0;
        int index = 0;
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).length() > max) {
                max = villes.get(i).length();
                index = i;
            }
        }
        System.out.println("La ville avec le plus grand nombre de lettres est : " + villes.get(index));
        // Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
        //majuscules
        villes.replaceAll(String::toUpperCase);
        System.out.println("Liste des villes en majuscules : " + villes);
        // Supprimez de la liste les villes dont le nom commence par la lettre N
        villes.removeIf(s -> s.startsWith("N"));
        System.out.println("Liste des villes sans les villes qui commencent par la lettre N : " + villes);
    }
}
