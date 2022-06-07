package fr.diginamic.gestionsalaire.entite;

public class Personne {
    private String nom;
    private String prenom;
    private String numSecuriteSociale;
    private Adresse adresse;
    private Contact contact;

    public Personne(String nom, String prenom, String numSecuriteSociale, Adresse adresse, Contact contact) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecuriteSociale = numSecuriteSociale;
        this.adresse = adresse;
        this.contact = contact;
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

    public String getNumSecuriteSociale() {
        return numSecuriteSociale;
    }

    public void setNumSecuriteSociale(String numSecuriteSociale) {
        this.numSecuriteSociale = numSecuriteSociale;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numSecuriteSociale='" + numSecuriteSociale + '\'' +
                ", adresse=" + adresse +
                ", contact=" + contact +
                '}';
    }
}
