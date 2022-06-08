package sets.exercice1;

import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.5);
        set.add(8.25);
        set.add(7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);

        // Affichez tous les éléments de la collection
        for (Double d : set) {
            System.out.println(d);
        }

        // Recherchez le plus grand élément de la collection
        double max = set.iterator().next();
        for (Double d : set) {
            if (d > max) {
                max = d;
            }
        }
        System.out.println("L'élément le plus grand de la collection est : " + max);

        // Supprimez le plus petit élément de la collection
        double min = set.iterator().next();
        for (Double d : set) {
            if (d < min) {
                min = d;
            }
        }
        set.remove(min);

        // Affichez enfin le contenu de la collection ainsi modifiée
        System.out.println("Collection modifiée : " + set);
    }
}
