package fr.diginamic.gestionsalaire.entite;

import fr.diginamic.gestionsalaire.dao.MetierDAO;

public class Employe extends Personne implements MetierDAO {

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
        return "Employe{" +
                "matricule='" + matricule + '\'' +
                ", metier=" + metier +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public String gererProjet() {
        if(this.getMetier().equals(Metier.CADRE)){
            return "Gérer les projets";
        }
        return "";
    }

    @Override
    public String fabriquer() {
        if(this.getMetier().equals(Metier.TECHNICIEN)){
            return "Fabriquer des produits";
        }
        return "";
    }

    @Override
    public String controler() {
        if(this.getMetier().equals(Metier.TECHNICIEN)){
            return "Contrôler les produits";
        }
        return "";
    }

    @Override
    public String trouverContact() {
        if(this.getMetier().equals(Metier.COMMERCIAL)){
            return "Trouver de nouveaux contacts";
        }
        return "";
    }

}
