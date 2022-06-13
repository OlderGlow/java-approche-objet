package fr.diginamic.services;

import fr.diginamic.entite.Ville;
import fr.diginamic.recensement.MenuService;

import java.util.List;
import java.util.Scanner;

public class RechercherPopulationVille extends MenuService {
    @Override
    public void traiter(List<Ville> villes, Scanner scanner) {
        System.out.println("Rechercher la population d'une ville");
        System.out.println("Entrez le nom de la ville : ");
        String nomVille = scanner.nextLine();
        int population = 0;
        for (Ville ville : villes) {
            if (ville.getNomCommune().equals(nomVille)) {
                population = ville.getPopulation();
            }
        }
        System.out.println("La population de " + nomVille + " est de " + population);
    }
}
