package maps.exercice2;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(62, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
        for (Integer cle : mapVilles.keySet()) {
            System.out.println(cle);
        }

        // Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
        for (String valeur : mapVilles.values()) {
            System.out.println(valeur);
        }

        // Afficher la taille de la map
        System.out.println("La taille de la map est de : " + mapVilles.size());
    }
}