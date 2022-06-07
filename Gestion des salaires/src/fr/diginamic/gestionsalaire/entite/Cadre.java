package fr.diginamic.gestionsalaire.entite;

public class Cadre extends Salaire {
    private static final int nbJoursTravailles = 212;
    private double tauxJournalier;

    public Cadre(double tauxJournalier) {
        super(0, 0);
        this.tauxJournalier = tauxJournalier;
    }

    public double getTauxJournalier() {
        return tauxJournalier;
    }

    public void setTauxJournalier(double tauxJournalier) {
        this.tauxJournalier = tauxJournalier;
    }

    @Override
    public void calculerSalaireBrut() {
        this.setSalaireBrut(nbJoursTravailles * this.tauxJournalier);
    }
}
