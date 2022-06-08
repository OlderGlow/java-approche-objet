package maps.exercice5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        List<Pays> listePays = new ArrayList<>(List.of(
                new Pays("France", 67000000, "Europe"),
                new Pays("Allemagne", 81700000, "Europe"),
                new Pays("Belgique", 10700000, "Europe"),
                new Pays("Russie", 14000000, "Europe"),
                new Pays("Chine", 135700000, "Asie"),
                new Pays("Indonésie", 24400000, "Asie"),
                new Pays("Australie", 24700000, "Océanie")
        ));
        // Utilisez une HashMap pour réaliser un comptage du nombre de pays par continent.
        HashMap<String, Integer> comptage = new HashMap<>();
        for (Pays pays : listePays) {
            if (comptage.containsKey(pays.getContinent())) {
                comptage.put(pays.getContinent(), comptage.get(pays.getContinent()) + 1);
            } else {
                comptage.put(pays.getContinent(), 1);
            }
        }
        System.out.println(comptage);
    }
}
