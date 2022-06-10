package fr.diginamic.entites;

import fr.diginamic.formes.Forme;

import java.text.DecimalFormat;

public class Cercle extends Forme {
    private double rayon;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculerSurface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public String toString() {
        return "Cercle de rayon " + rayon + " :\n" +
                "Perimetre = " + df.format(calculerPerimetre()) + "\n" +
                "Surface = " + df.format(calculerSurface());
    }
}
