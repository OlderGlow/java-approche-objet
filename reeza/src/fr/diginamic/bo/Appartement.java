package fr.diginamic.bo;

public class Appartement extends Logement {

    private int etage;

    public Appartement(int id, double prixLocationParNuit, Adresse adresse, int nbMaxLocataires, boolean estReserve, int etage) {
        super(id, prixLocationParNuit, adresse, nbMaxLocataires, estReserve);
        this.etage = etage;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        return super.toString() + "Il est situé à l'étage " + etage + ".";
    }
}
