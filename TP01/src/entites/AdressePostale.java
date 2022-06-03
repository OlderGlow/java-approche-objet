package entites;

public class AdressePostale {
    int numeroRue;
    String rue;
    int codePostal;
    String ville;

    public AdressePostale(int numeroRue, String rue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
