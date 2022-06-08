package listes.exercice3;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste1 = new ArrayList<Integer>();
        liste1.add(-1);
        liste1.add(5);
        liste1.add(7);
        liste1.add(3);
        liste1.add(-2);
        liste1.add(4);
        liste1.add(8);
        liste1.add(5);
        System.out.println("Taille de la liste : " + liste1.size());
        // afficher l'élément le plus grand de la liste
        int max = liste1.get(0);
        for (Integer integer : liste1) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println("L'élément le plus grand de la liste est : " + max);
        // supprimer l'élément le plus petit de la liste
        Iterator<Integer> it = liste1.iterator();
        int min = it.next();
        int index = 0;
        while (it.hasNext()) {
            int current = it.next();
            if (current < min) {
                min = current;
                index = liste1.indexOf(current);
            }
        }
        liste1.remove(index);
        // Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent
        //positifs.
        for (int i = 0; i < liste1.size(); i++) {
            if (liste1.get(i) < 0) {
                liste1.set(i, -liste1.get(i));
            }
        }
        // afficher la liste
        System.out.println("Liste modifiée : " + liste1);
    }
}
