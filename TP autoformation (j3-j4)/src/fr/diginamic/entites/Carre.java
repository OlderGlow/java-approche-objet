package fr.diginamic.entites;

public class Carre extends Rectangle {

    private double longueur;

    public Carre(double longueur) {
        super(longueur, longueur);
    }

    @Override
    public double getLongueur() {
        return longueur;
    }

    @Override
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Carre de cote " + super.getLongueur() + " :\n" +
                "Perimetre = " + calculerPerimetre() + "\n" +
                "Surface = " + calculerSurface();
    }
}
