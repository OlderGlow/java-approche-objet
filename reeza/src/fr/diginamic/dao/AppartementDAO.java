package fr.diginamic.dao;

import fr.diginamic.bo.Adresse;
import fr.diginamic.bo.Appartement;

import java.util.ArrayList;
import java.util.List;

public class AppartementDAO {
    private List<Appartement> appartements = new ArrayList<>();

    public AppartementDAO() {
        appartements.add(new Appartement(1, 100, new Adresse("8 rue de la paix", "75000", "Paris"), 2, 1, false));
        appartements.add(new Appartement(2, 200, new Adresse("4 avenue de la torture", "49000", "Angers"), 13, 2, false));
    }

    public List<Appartement> getAppartements() {
        return appartements;
    }

    public void setAppartements(List<Appartement> appartements) {
        this.appartements = appartements;
    }
}
