package fr.diginamic;

import fr.diginamic.bll.ReservationService;
import fr.diginamic.exception.AppartementDejaReserveException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws AppartementDejaReserveException {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        do {
            afficherMenu();
            choix = scanner.nextInt();
            switch (choix) {
                case 1 -> {
                    try {
                        ReservationService.reserverAppartement(scanner);
                    } catch (AppartementDejaReserveException e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 2 -> {
                    ReservationService.libererAppartement(scanner);
                }
                case 3 -> {
                    ReservationService.listerAppartementsDisponibles();
                }
                case 4 -> {
                    ReservationService.listerAppartementsReserves();
                }
                case 99 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix incorrect");
            }
        } while (choix != 99);
        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("1 - Réserver un appartement pour X personnes");
        System.out.println("2 - Libérer un appartement");
        System.out.println("3 - Lister les appartements disponibles");
        System.out.println("4 - Lister les appartements réservés");
        System.out.println("99 - Quitter");
    }
}
