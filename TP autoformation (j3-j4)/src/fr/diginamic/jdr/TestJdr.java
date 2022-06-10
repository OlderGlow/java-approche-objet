package fr.diginamic.jdr;

import java.util.Scanner;

public class TestJdr {

    public static Scanner sc = new Scanner(System.in);
    static Personnage personnage;
    static Creature creature;
    static boolean isRunning = true;

    public static void main(String[] args) {
        do {
            menu();
        } while (isRunning);
        sc.close();
    }

    public static void menu() {
        System.out.println("1 - Créer un personnage");
        System.out.println("2 - Combattre une créature");
        System.out.println("3 - Afficher le score");
        System.out.println("4 - Quitter");
        System.out.println("Votre choix : ");
        int choix = sc.nextInt();
        switch (choix) {
            case 1 -> creerPersonnage();
            case 2 -> {
                if (personnage == null) {
                    System.err.println("Vous devez créer un personnage avant de pouvoir combattre");
                } else {
                    creature = choixCreature();
                    if(creature == null) {
                        System.err.println("Choix incorrect");
                    } else {
                        combattreCreature(personnage);
                    }
                }
            }
            case 3 -> {
                if(personnage == null) {
                    System.err.println("Vous devez créer un personnage avant de pouvoir afficher le score");
                } else {
                    System.out.println("Votre score est de " + personnage.getScore());
                }
            }
            case 4 -> System.exit(0);
        }
    }

    public static void combattreCreature(Personnage personnage) {
        personnage.combattre(creature);
        if (personnage.getPointsDeVie() > 0) {
            System.out.println("Vous avez gagné le combat !");
            if (creature instanceof Loup) {
                personnage.setScore(personnage.getScore() + 1);
            } else if (creature instanceof Gobelin) {
                personnage.setScore(personnage.getScore() + 2);
            } else {
                personnage.setScore(personnage.getScore() + 5);
            }
        } else {
            System.out.println("Vous avez perdu ! Voici votre score : " + personnage.getScore());
            isRunning = false;
        }
    }

    public static Creature choixCreature() {
        System.out.println("1 - Créature : Gobelin");
        System.out.println("2 - Créature : Loup");
        System.out.println("3 - Créature : Troll");
        int choix = sc.nextInt();
        return switch (choix) {
            case 1 -> new Gobelin();
            case 2 -> new Loup();
            case 3 -> new Troll();
            default -> null;
        };
    }

    public static void creerPersonnage() {
        personnage = new Personnage();
    }
}
