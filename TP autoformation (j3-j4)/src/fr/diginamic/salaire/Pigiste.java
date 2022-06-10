package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int nbJoursTravailles;
    private double montantJournalier;

    public Pigiste(String nom, String prenom, int nbJoursTravailles, double montantJournalier) {
        super(nom, prenom);
        this.nbJoursTravailles = nbJoursTravailles;
        this.montantJournalier = montantJournalier;
    }


    public int getNbJoursTravailles() {
        return nbJoursTravailles;
    }

    public void setNbJoursTravailles(int nbJoursTravailles) {
        this.nbJoursTravailles = nbJoursTravailles;
    }

    public double getMontantJournalier() {
        return montantJournalier;
    }

    public void setMontantJournalier(double montantJournalier) {
        this.montantJournalier = montantJournalier;
    }

    @Override
    public double getSalaire() {
        return nbJoursTravailles * montantJournalier;
    }
}
