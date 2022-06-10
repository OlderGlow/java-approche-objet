package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            System.out.println(saison.getNom() + " " + saison.getNumero());
        }

        String nom = "ETE";
        Saison saison = Saison.valueOf(nom);
        System.out.println(saison.getNom() + " " + saison.getNumero());

        String libelle = "Hiver";
        Saison saison2 = Saison.getSaison(libelle);
        System.out.println(saison2);
    }
}
