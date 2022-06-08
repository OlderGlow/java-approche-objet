package sets.exercice2;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("USA");
        set.add("France");
        set.add("Allemagne");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Russie");
        set.add("Inde");

        // Recherchez le pays dans cette liste qui a le plus grand nombre de lettres via un HashSet
        Iterator<String> it = set.iterator();
        int max = it.next().length();
        String pays = it.next();
        while (it.hasNext()) {
            String s = it.next();
            if (s.length() > max) {
                max = s.length();
                pays = s;
            }
        }
        System.out.println("Le pays avec le plus grand nombre de lettres est : " + pays);
        // Supprimez ce pays
        set.remove(pays);

        // Affichez enfin le contenu de la collection ainsi modifiée
        System.out.println("Collection modifiée : " + set);

    }
}
