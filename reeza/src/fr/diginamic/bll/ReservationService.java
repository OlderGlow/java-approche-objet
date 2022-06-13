package fr.diginamic.bll;

import fr.diginamic.bo.Appartement;
import fr.diginamic.dao.AppartementDAO;
import fr.diginamic.exception.AppartementDejaReserveException;

import java.util.List;
import java.util.Scanner;

public class ReservationService {
    static AppartementDAO appartementDAO = new AppartementDAO();
    private static List<Appartement> appartements = appartementDAO.getAppartements();

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

    public static void reserverAppartement(Appartement appartement) throws AppartementDejaReserveException {
        if (appartement != null) {
            if(appartement.isEstReserve()) {
                throw new AppartementDejaReserveException();
            }
            appartement.setEstReserve(true);
            System.out.println("Appartement réservé");
        } else {
            System.err.println("Appartement inconnu");
        }
    }

    public static void libererAppartement(Appartement appartement) {
        if (appartement != null && appartement.isEstReserve()) {
            appartement.setEstReserve(false);
            System.out.println("Appartement libéré");
        } else {
            System.err.println("Appartement inconnu ou déjà réservé !");
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
