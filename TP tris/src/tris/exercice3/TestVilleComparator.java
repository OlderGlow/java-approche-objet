package tris.exercice3;

import java.util.ArrayList;

public class TestVilleComparator {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Réalisez un tri avec le premier comparateur et affichez le résultat
        System.out.println("Tri avec le premier comparateur");
        ComparatorHabitant comparateurHabitant = new ComparatorHabitant();
        villes.sort(comparateurHabitant);
        for (Ville ville : villes) {
            System.out.println(ville);
        }
        System.out.println("**************************");
        // Réalisez un tri avec le deuxième comparateur et affichez le résultat
        System.out.println("Tri avec le deuxième comparateur");
        ComparatorNom comparateurNom = new ComparatorNom();
        villes.sort(comparateurNom);
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
