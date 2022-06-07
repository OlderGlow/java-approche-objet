package fr.diginamic.banque.entites;

public class Compte {
    private int numeroCompte;
    private double soldeCompte;
    private Operation[] operations = new Operation[0];

    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public Compte(int numeroCompte, double soldeCompte, Operation[] operations) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
        this.operations = operations;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public Operation[] getOperations() {
        return operations;
    }

    public void setOperations(Operation[] operations) {
        this.operations = operations;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(float soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte : " + numeroCompte + " - Nombre d'opérations : " + operations.length +  " - Solde : " + soldeCompte + "€";
    }

}
