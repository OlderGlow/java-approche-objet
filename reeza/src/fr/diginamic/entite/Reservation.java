package fr.diginamic.entite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reservation {
    private List<Appartement> appartements = new ArrayList<>();

    public Reservation() {
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
