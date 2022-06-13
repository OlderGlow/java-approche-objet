package fr.diginamic.recensement;

import fr.diginamic.entite.Ville;

import java.util.List;
import java.util.Scanner;

public abstract class MenuService {

    public abstract void traiter(List<Ville> villes, Scanner scanner) ;

        public static void afficherMenu() {

            System.out.println("1 - Population d'une ville donnée");
            System.out.println("2 - Population d'un département donné");
            System.out.println("3 - Population d'une région donnée");
            System.out.println("4 - Afficher les 10 régions les plus peuplées");
            System.out.println("5 - Afficher les 10 départements les plus peuplés");
            System.out.println("6 - Afficher les 10 villes les plus peuplées d'un département");
            System.out.println("7 - Afficher les 10 villes les plus peuplées d'une région");
            System.out.println("8 - Afficher les 10 villes les plus peuplées de France");
            System.out.println("9 - Sortir du programme");

        }
}
