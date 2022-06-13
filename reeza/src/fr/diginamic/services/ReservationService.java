package fr.diginamic.services;

import fr.diginamic.entite.Adresse;
import fr.diginamic.entite.Appartement;
import fr.diginamic.entite.Reservation;
import fr.diginamic.exception.AppartementDejaReserveException;

import java.util.List;
import java.util.Scanner;

public class ReservationService {
    static Reservation reservation = new Reservation();
    private static List<Appartement> appartements = reservation.getAppartements();

    public static void listerAppartementsDisponibles() {
        for (Appartement appartement : appartements) {
            if (!appartement.isEstReserve()) {
                System.out.println(appartement);
            }
        }
    }

    public static void listerAppartementsReserves() {
        for (Appartement appartement : appartements) {
            if (appartement.isEstReserve()) {
                System.out.println(appartement);
            }
        }
    }

    public static void reserverAppartement(Scanner scanner) throws AppartementDejaReserveException {
        listerAppartementsDisponibles();
        System.out.println("Quel appartement souhaitez-vous réserver ?");
        int idAppartement = scanner.nextInt();
        Appartement appartement = rechercherAppartement(idAppartement);
        if (appartement != null) {
            if(appartement.isEstReserve()) {
                throw new AppartementDejaReserveException();
            }
            System.out.println("Combien de personnes souhaitez-vous ?");
            int nbPersonnes = scanner.nextInt();
            if (nbPersonnes <= appartement.getNbMaxLocataires()) {
                appartement.setEstReserve(true);
                System.out.println("Appartement réservé");
            } else {
                System.out.println("Il n'y a pas assez de place pour cette réservation");
            }
        } else {
            System.err.println("Appartement inconnu");
        }
    }

    public static void libererAppartement(Scanner scanner) {
        listerAppartementsReserves();
        System.out.println("Quel appartement souhaitez-vous libérer ?");
        int idAppartement = scanner.nextInt();
        Appartement appartement = rechercherAppartement(idAppartement);
        if (appartement != null) {
            appartement.setEstReserve(false);
            System.out.println("Appartement libéré");
        } else {
            System.err.println("Appartement inconnu");
        }
    }

    public static Appartement rechercherAppartement(int id) {
        for (Appartement appartement : appartements) {
            if (appartement.getId() == id) {
                return appartement;
            }
        }
        return null;
    }
}
