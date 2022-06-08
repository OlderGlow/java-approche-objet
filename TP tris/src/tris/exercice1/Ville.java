package tris.exercice1;

public class Ville implements Comparable<Ville> {
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

    @Override
    public int compareTo(Ville o) {
        return this.getNom().compareTo(o.getNom());
    }
}
