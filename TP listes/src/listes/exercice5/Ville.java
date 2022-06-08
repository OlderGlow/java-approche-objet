package listes.exercice5;

import java.util.ArrayList;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return nom + " - " + nbHabitants + " habitants";
    }

}
