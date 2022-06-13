package fr.diginamic.bo;

public class Peniche extends Logement {

    private int longueur;

    public Peniche(int id, double prixLocationParNuit, Adresse adresse, int nbMaxLocataires, boolean estReserve, int longueur) {
        super(id, prixLocationParNuit, adresse, nbMaxLocataires, estReserve);
        this.longueur = longueur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return super.toString() + "La longueur de la péniche est de " + longueur + " mètres de long.";
    }
}
