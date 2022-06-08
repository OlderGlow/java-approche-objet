package sets.exercice3;

public class Pays {
    private String nom;
    private int nbHabitants;
    private double pibHab;

    public Pays(String nom, int nbHabitants, double pibHab) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHab = pibHab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public double getPibHab() {
        return pibHab;
    }

    public void setPibHab(double pibHab) {
        this.pibHab = pibHab;
    }
}
