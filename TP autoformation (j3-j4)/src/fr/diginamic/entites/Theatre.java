package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int nbPlaces;
    private int nbPersonnesInscrites;
    private double recetteTotale;

    public Theatre(String nom, int nbPlaces) {
        this.nom = nom;
        this.nbPlaces = nbPlaces;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getNbPersonnesInscrites() {
        return nbPersonnesInscrites;
    }

    public void setNbPersonnesInscrites(int nbPersonnesInscrites) {
        this.nbPersonnesInscrites = nbPersonnesInscrites;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    public void setRecetteTotale(double recetteTotale) {
        this.recetteTotale = recetteTotale;
    }

    public void inscrire(int nbPersonnes, double prixPlace) {
        if (nbPersonnesInscrites + nbPersonnes > nbPlaces) {
            System.err.println("Il n'y a plus de place pour " + nbPersonnes + " personnes");
        } else {
            nbPersonnesInscrites += nbPersonnes;
            recetteTotale += nbPersonnes * prixPlace;
            System.out.println("Inscription effectuée avec succes");
        }
    }

    public String toString() {
        return "Theatre " + nom + " :\n" +
                "Nombre de places = " + nbPlaces + "\n" +
                "Nombre de personnes inscrites = " + nbPersonnesInscrites + "\n" +
                "Recette totale = " + recetteTotale + "€";
    }
}
