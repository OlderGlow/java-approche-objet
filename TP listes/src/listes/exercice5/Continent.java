package listes.exercice5;

public enum Continent {
    EUROPE("Europe", 1),
    ASIA("Asie", 2),
    AFRICA("Afrique", 3),
    AMERICA("Amérique", 4),
    OCEAN("Océanie", 5);

    private String nom;
    private int numero;

    Continent(String nom, int numero) {
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
}
