package fr.diginamic.gestionsalaire.entite;

public class Contact {
    private String numeroTelephone;
    private String email;
    private String service;
    private Adresse adresse;

    public Contact(String numeroTelephone, String email, String service, Adresse adresse) {
        this.numeroTelephone = numeroTelephone;
        this.email = email;
        this.service = service;
        this.adresse = adresse;
    }

    public Contact(String numeroTelephone, String email) {
        this.numeroTelephone = numeroTelephone;
        this.email = email;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "numeroTelephone='" + numeroTelephone + '\'' +
                ", email='" + email + '\'' +
                ", service='" + service + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
