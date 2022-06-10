package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Intervenant i1 = new Salarie("Dupont", "Jean", 1000);
        Intervenant i2 = new Pigiste("Dupont", "Jean", 10, 102);
        System.out.println(i1.getSalaire());
        System.out.println(i2.getSalaire());
        i1.afficherDonnees();
        i2.afficherDonnees();
    }
}
