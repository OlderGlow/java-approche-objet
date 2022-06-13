package fr.diginamic.bo;

public abstract class Logement {
    private int id;
    private double prixLocationParNuit;
    private Adresse adresse;
    private int nbMaxLocataires;
    private boolean estReserve;

    public Logement(int id, double prixLocationParNuit, Adresse adresse, int nbMaxLocataires, boolean estReserve) {
        this.id = id;
        this.prixLocationParNuit = prixLocationParNuit;
        this.adresse = adresse;
        this.nbMaxLocataires = nbMaxLocataires;
        this.estReserve = estReserve;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrixLocationParNuit() {
        return prixLocationParNuit;
    }

    public void setPrixLocationParNuit(double prixLocationParNuit) {
        this.prixLocationParNuit = prixLocationParNuit;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getNbMaxLocataires() {
        return nbMaxLocataires;
    }

    public void setNbMaxLocataires(int nbMaxLocataires) {
        this.nbMaxLocataires = nbMaxLocataires;
    }

    public boolean isEstReserve() {
        return estReserve;
    }

    public void setEstReserve(boolean estReserve) {
        this.estReserve = estReserve;
    }

    @Override
    public String toString() {
        return this.getId() + " - " + this.getType() + " est situé à " + this.getAdresse() + " et peut-être réservé pour " + this.getNbMaxLocataires() + " personnes. Coût/nuit : " + this.getPrixLocationParNuit() +"€"+ "\n";
    }

    private String getType() {
        return this.getClass().getSimpleName();
    }

}
