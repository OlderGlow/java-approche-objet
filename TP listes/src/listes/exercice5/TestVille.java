package listes.exercice5;

import java.util.ArrayList;

public class TestVille {
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

        // Recherchez et affichez la ville la plus peuplée
        int max = 0;
        int index1 = 0;
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() > max) {
                max = villes.get(i).getNbHabitants();
                index1 = i;
            }
        }
        System.out.println("La ville la plus peuplée est : " + villes.get(index1));

        // Supprimez la ville la moins peuplée de la liste
        int min = villes.get(0).getNbHabitants();
        int index2 = 0;
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() < min) {
                min = villes.get(i).getNbHabitants();
                index2 = i;
            }
        }
        villes.remove(index2);
        System.out.println("Liste des villes sans la ville la moins peuplée : " + villes);

        // Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        System.out.println("Liste des villes de plus de 100 000 hab. en majuscules : " + villes);

    }
}
