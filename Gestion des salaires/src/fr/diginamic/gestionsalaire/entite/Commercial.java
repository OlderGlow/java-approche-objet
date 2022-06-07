package fr.diginamic.gestionsalaire.entite;

public class Commercial extends Salaire{

    private double chiffreAffaire = 0;

    public Commercial(double chiffreAffaire) {
        super(0, 0);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaireBrut() {
        this.setSalaireBrut(this.getChiffreAffaire() * 0.05);
        return this.getChiffreAffaire() * 0.05;
    }
}
