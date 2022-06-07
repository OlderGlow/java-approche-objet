package fr.diginamic.gestionsalaire.entite;

public abstract class Salaire {

    private final static double TAUX_SALAIRE_BASE = 0.24;
    private double salaireNet;
    private double salaireBrut;

    public Salaire(double salaireNet, double salaireBrut) {
        this.salaireNet = salaireNet;
        this.salaireBrut = salaireBrut;
    }

    public double getSalaireNet() {
        return salaireNet;
    }

    public void setSalaireNet(double salaireNet) {
        this.salaireNet = salaireNet;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public double calculerSalaireNet() {
         this.setSalaireNet(salaireBrut * (1-TAUX_SALAIRE_BASE)/12);
         return this.getSalaireNet();
    }

    protected abstract double calculerSalaireBrut();

    @Override
    public String toString() {
        return "Salaire annuel brut : " + this.getSalaireBrut() + "€\n" + "Salaire net mensuel : " + this.getSalaireNet() + "€";
    }
}
