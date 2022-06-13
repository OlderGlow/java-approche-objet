package fr.diginamic.entite;

public class Appartement {
    private int id;
    private double prixLocationParNuit;
    private Adresse adresse;
    private int nbMaxLocataires;
    private int etage;
    private boolean estReserve;

    public Appartement(int id, double prixLocationParNuit, Adresse adresse, int nbMaxLocataires, int etage, boolean estReserve) {
        this.id = id;
        this.prixLocationParNuit = prixLocationParNuit;
        this.adresse = adresse;
        this.nbMaxLocataires = nbMaxLocataires;
        this.etage = etage;
        this.estReserve = estReserve;
    }

    public int getId() {
        return id;
    }

    public double getPrixLocationParNuit() {
        return prixLocationParNuit;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public int getNbMaxLocataires() {
        return nbMaxLocataires;
    }

    public int getEtage() {
        return etage;
    }

    public boolean isEstReserve() {
        return estReserve;
    }

    public void setPrixLocationParNuit(double prixLocationParNuit) {
        this.prixLocationParNuit = prixLocationParNuit;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setNbMaxLocataires(int nbMaxLocataires) {
        this.nbMaxLocataires = nbMaxLocataires;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public void setEstReserve(boolean estReserve) {
        this.estReserve = estReserve;
    }

    @Override
    public String toString() {
        return "L'appartement " + id + " est situé à " + adresse + " et peut-être réservé pour " + nbMaxLocataires + " personnes." + "\n" + " Il est situé à l'étage " + etage + " et son prix de location est de " + prixLocationParNuit + "€.";
    }
}
