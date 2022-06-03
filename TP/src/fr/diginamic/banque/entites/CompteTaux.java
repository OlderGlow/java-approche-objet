package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public CompteTaux(int numeroCompte, double soldeCompte, double tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + " - Taux de remuneration : " + tauxRemuneration + " %";
    }
}
