package fr.diginamic;

import fr.diginamic.bll.ReservationService;
import fr.diginamic.bo.Appartement;
import fr.diginamic.bo.Logement;
import fr.diginamic.exception.LogementDejaReserveException;

import java.util.Scanner;

import static fr.diginamic.bll.ReservationService.*;

public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choix = 0;
        do {
            afficherMenu();
            choix = scanner.nextInt();
            switch (choix) {
                case 1 -> {
                    try {
                        reserverAppartement();
                    } catch (LogementDejaReserveException e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 2 -> {
                    libererAppartement();
                }
                case 3 -> {
                    listerAppartementsDisponibles();
                }
                case 4 -> {
                    listerAppartementsReserves();
                }
                case 99 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix incorrect");
            }
        } while (choix != 99);
        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("1 - Réserver un logement pour X personnes");
        System.out.println("2 - Libérer un logement");
        System.out.println("3 - Lister les logements disponibles");
        System.out.println("4 - Lister les logements réservés");
        System.out.println("99 - Quitter");
    }

    private static boolean estReserve(Appartement appartement) {
        return appartement.isEstReserve();
    }

    private static void reserverAppartement() throws LogementDejaReserveException {
        listerAppartementsDisponibles();
        System.out.println("Quel logement souhaitez-vous réserver ?");
        int idAppartement = scanner.nextInt();
        Logement logement = rechercherLogement(idAppartement);
        System.out.println("Combien de personnes souhaitez-vous ?");
        int nbPersonnes = scanner.nextInt();
        assert logement != null;
        if (nbPersonnes <= logement.getNbMaxLocataires()) {
            ReservationService.reserverLogement(logement);
        } else {
            System.err.println("Il n'y a pas assez de place pour cette réservation");
        }
    }

    private static void libererAppartement() {
        listerAppartementsReserves();
        System.out.println("Quel appartement souhaitez-vous libérer ?");
        int idAppartement = scanner.nextInt();
        Logement logement = rechercherLogement(idAppartement);
        ReservationService.libererLogement(logement);
    }
}
