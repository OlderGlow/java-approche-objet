package fr.diginamic.entite;

public class Ville {

    private int codeRegion;
    private String nomRegion;
    private int codeDepartement;
    private String nomDepartement;
    private int codeCommune;
    private String nomCommune;
    private int population;

    public Ville(int codeRegion, String nomRegion, int codeDepartement, String nomDepartement, int codeCommune, String nomCommune, int population) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.nomDepartement = nomDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(int codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(int codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}
