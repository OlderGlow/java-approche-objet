package tris.exercice1;

import tris.exercice1.Ville;

import java.util.ArrayList;

public class VilleTest {
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

        // trier les villes par ordre alphabétique en utilisant la méthode compareTo
        for (int i = 0; i < villes.size() - 1; i++) {
            for (int j = i + 1; j < villes.size(); j++) {
                if (villes.get(i).compareTo(villes.get(j)) > 0) {
                    Ville tmp = villes.get(i);
                    villes.set(i, villes.get(j));
                    villes.set(j, tmp);
                }
            }
        }
        System.out.println("Liste des villes triées par ordre alphabétique : " + villes);
    }
}
