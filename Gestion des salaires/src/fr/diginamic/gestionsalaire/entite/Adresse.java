package fr.diginamic.gestionsalaire.entite;

public class Adresse {
    private String numeroRue;
    private String rue;
    private String codePostal;
    private String ville;

    public Adresse(String numeroRue, String rue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numeroRue='" + numeroRue + '\'' +
                ", rue='" + rue + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
