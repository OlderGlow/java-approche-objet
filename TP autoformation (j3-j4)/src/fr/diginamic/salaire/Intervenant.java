package fr.diginamic.salaire;

public abstract class Intervenant {
    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public abstract double getSalaire();

    public void afficherDonnees() {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Salaire : " + getSalaire());
        System.out.println(getStatut());
    }

    public String getStatut() {
        if (this instanceof Salarie) {
            return "Salarié";
        } else if (this instanceof Pigiste) {
            return "Pigiste";
        } else {
            return "Autre";
        }
    }
}
