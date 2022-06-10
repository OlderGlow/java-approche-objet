package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Ete", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String nom;
    private int numero;

    Saison(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static Saison getSaison(String nom) {
        for (Saison saison : Saison.values()) {
            if (saison.getNom().equals(nom)) {
                return saison;
            }
        }
        return null;
    }
}
