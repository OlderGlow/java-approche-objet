package fr.diginamic.gestionsalaire.entite;

public class Technicien extends Salaire {
    private double heuresTravailles;
    private double tauxHoraire;

    public Technicien(double heuresTravailles, double tauxHoraire) {
        super(0, 0);
        this.heuresTravailles = heuresTravailles;
        this.tauxHoraire = tauxHoraire;
    }

    public double getHeuresTravailles() {
        return heuresTravailles;
    }

    public void setHeuresTravailles(double heuresTravailles) {
        this.heuresTravailles = heuresTravailles;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaireBrut() {
        this.setSalaireBrut(this.getHeuresTravailles() * this.getTauxHoraire());
        return this.heuresTravailles * this.tauxHoraire;
    }
}
