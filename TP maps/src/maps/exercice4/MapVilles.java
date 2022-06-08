package maps.exercice4;

import listes.exercice5.Ville;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> villes = new HashMap<>();
        villes.put("Nice", new Ville("Nice", 343000));
        villes.put("Carcassonne", new Ville("Carcassonne", 50000));
        villes.put("Narbonne", new Ville("Narbonne", 120000));
        villes.put("Marseille", new Ville("Marseille", 1200000));
        villes.put("Lyon", new Ville("Lyon", 484000));
        villes.put("Foix", new Ville("Foix", 9700));
        villes.put("Pau", new Ville("Pau", 77200));
        villes.put("Tarbes", new Ville("Tarbes", 40600));

        // Recherchez et supprimez la ville qui a le moins d’habitants
        int min = villes.get("Nice").getNbHabitants();
        String nom = "Nice";
        for (String key : villes.keySet()) {
            if (villes.get(key).getNbHabitants() < min) {
                min = villes.get(key).getNbHabitants();
                nom = key;
            }
        }
        System.out.println("La ville qui a le moins d'habitants est : " + villes.get(nom));
        villes.remove(nom);

        // Affichez l’ensemble des villes restantes.
        System.out.println("Liste des villes restantes : " + villes);
    }
}
