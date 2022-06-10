package listes.exercice5;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Paris", 2_000_000, Continent.EUROPE));
        villes.add(new Ville("Marseille", 800_000, Continent.EUROPE));
        villes.add(new Ville("Lyon", 600_000, Continent.EUROPE));
        villes.add(new Ville("Tokyo", 9_000_000, Continent.ASIA));
        villes.add(new Ville("Beijing", 21_000_000, Continent.ASIA));
        villes.add(new Ville("New York", 8_000_000, Continent.AMERICA));
        villes.add(new Ville("Los Angeles", 4_000_000, Continent.AMERICA));
        villes.add(new Ville("Rio de Janeiro", 2_000_000, Continent.AMERICA));
        villes.add(new Ville("Tunis", 1_000_000, Continent.AFRICA));

        System.out.println("Liste des villes :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
