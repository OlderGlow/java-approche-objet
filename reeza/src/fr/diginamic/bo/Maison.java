package fr.diginamic.bo;

public class Maison extends Logement{
    private boolean hasGarden = false;

    public Maison(int id, double prixLocationParNuit, Adresse adresse, int nbMaxLocataires, boolean estReserve, boolean hasGarden) {
        super(id, prixLocationParNuit, adresse, nbMaxLocataires, estReserve);
        this.hasGarden = hasGarden;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return super.toString() + "La maison a un jardin : " + (hasGarden ? "oui" : "non") + ".";
    }
}
