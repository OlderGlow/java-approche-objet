package tris.exercice2;

import java.util.ArrayList;

public class TestVilleCompareToInt {
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

        // Trier par nombre d'habitants en utilisant la méthode compareTo de la classe Ville et afficher les résultats
        for(int i= 0; i < villes.size(); i++) {
            for(int j = 0; j < villes.size(); j++) {
                if(villes.get(i).compareTo(villes.get(j)) > 0) {
                    Ville temp = villes.get(i);
                    villes.set(i, villes.get(j));
                    villes.set(j, temp);
                }
            }
        }
        System.out.println(villes);

    }
}
