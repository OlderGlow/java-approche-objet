package sets.exercice3;

import java.util.HashSet;

public class TestPays {

    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        pays.add(new Pays("France", 67000000, 38625));
        pays.add(new Pays("Usa", 326000000, 63543.58));
        pays.add(new Pays("Allemagne", 80000000, 45723.64));
        pays.add(new Pays("UK", 60000000, 40284.64));
        pays.add(new Pays("Italie", 60000000, 31676.20));
        pays.add(new Pays("Japon", 126000000, 40113.06));
        pays.add(new Pays("Chine", 1300000000, 10500.40));
        pays.add(new Pays("Russie", 146000000, 10126.72));
        pays.add(new Pays("Inde", 12000000, 1900.40));

        // Recherchez le pays avec le PIB/habitant le plus important
        Pays paysMax = pays.iterator().next();
        for (Pays p : pays) {
            if (p.getPibHab() > paysMax.getPibHab()) {
                paysMax = p;
            }
        }
        System.out.println("Le pays avec le PIB/habitant le plus important est " + paysMax.getNom());

        // Recherchez le pays avec le PIB total le plus important
        Pays paysMax2 = pays.iterator().next();
        for (Pays p : pays) {
            if (p.getPibHab() * p.getNbHabitants() > paysMax2.getPibHab() * paysMax2.getNbHabitants()) {
                paysMax2 = p;
            }
        }
        // Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le
        //plus grand
        paysMax2.setNom(paysMax2.getNom().toUpperCase());
        System.out.println("Le pays avec le PIB total le plus important est " + paysMax2.getNom());

        // Supprimez le pays dont le PIB total est le plus petit
        Pays paysMin = pays.iterator().next();
        for (Pays p : pays) {
            if (p.getPibHab() * p.getNbHabitants() < paysMin.getPibHab() * paysMin.getNbHabitants()) {
                paysMin = p;
            }
        }
        pays.remove(paysMin);

        // Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB
        //total
        for (Pays p : pays) {
            System.out.println(p.getNom() + " " + p.getNbHabitants() + " " + p.getPibHab());
        }
    }
}
