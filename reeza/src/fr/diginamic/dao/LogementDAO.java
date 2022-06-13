package fr.diginamic.dao;

import fr.diginamic.bo.*;

import java.util.ArrayList;
import java.util.List;

public class LogementDAO {
    private List<Logement> logements = new ArrayList<>();

    public LogementDAO() {
        logements.add(new Appartement(1, 100, new Adresse("8 rue de la paix", "75000", "Paris"), 2, false, 1));
        logements.add(new Appartement(2, 200, new Adresse("4 avenue de la torture", "49000", "Angers"), 13, false, 2));
        logements.add(new Maison(3, 300, new Adresse("1 boulevard des bananiers", "72000", "Le Mans"), 8, false, true));
        logements.add(new Peniche(4, 400, new Adresse("101 bis lotissement des flots", "44000", "Nantes"), 20, false, 3));
    }

    public List<Logement> getAppartements() {
        return logements;
    }

    public void setAppartements(List<Logement> appartements) {
        this.logements = appartements;
    }
}
