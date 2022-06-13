package fr.diginamic.bll;

import fr.diginamic.bo.Logement;
import fr.diginamic.dao.LogementDAO;
import fr.diginamic.exception.LogementDejaReserveException;

import java.util.List;

public class ReservationService {
    static LogementDAO logementDAO = new LogementDAO();
    private static final List<Logement> logements = logementDAO.getAppartements();

    public static void listerAppartementsDisponibles() {
        for (Logement logement : logements) {
            if (!logement.isEstReserve()) {
                System.out.println(logement);
            }
        }
    }

    public static void listerAppartementsReserves() {
        for (Logement logement : logements) {
            if (logement.isEstReserve()) {
                System.out.println(logement);
            }
        }
    }

    public static void reserverLogement(Logement logement) throws LogementDejaReserveException {
        if (logement != null) {
            if (logement.isEstReserve()) {
                throw new LogementDejaReserveException();
            }
            logement.setEstReserve(true);
            System.out.println("Logement réservé");
        } else {
            System.err.println("Logement inconnu");
        }
    }

    public static void libererLogement(Logement logement) {
        if (logement != null && logement.isEstReserve()) {
            logement.setEstReserve(false);
            System.out.println("Logement libéré");
        } else {
            System.err.println("Logement inconnu ou déjà réservé !");
        }
    }

    public static Logement rechercherLogement(int id) {
        for (Logement logement : logements) {
            if (logement.getId() == id) {
                return logement;
            }
        }
        return null;
    }
}
