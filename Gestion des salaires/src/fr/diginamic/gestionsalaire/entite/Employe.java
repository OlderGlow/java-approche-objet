package fr.diginamic.gestionsalaire.entite;

public class Employe extends Personne {

    private String matricule;
    private Metier metier;
    private Salaire salaire;

    public Employe(String nom, String prenom, String numSecuriteSociale, Adresse adresse, Contact contact, String matricule, Metier metier) {
        super(nom, prenom, numSecuriteSociale, adresse, contact);
        this.matricule = matricule;
        this.metier = metier;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Metier getMetier() {
        return metier;
    }

    public void setMetier(Metier metier) {
        this.metier = metier;
    }

    @Override
    public String toString() {
        return  super.toString() + "Employe{" +
                "matricule='" + matricule + '\'' +
                ", metier=" + metier +
                '}';
    }
}
