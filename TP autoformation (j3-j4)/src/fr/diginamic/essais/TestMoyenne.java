package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        double[] tab = { 1, 2, 3, 4, 5 };
        for (double v : tab) {
            CalculMoyenne.ajouter(v);
        }
        System.out.println(CalculMoyenne.calculerMoyenne());
        double[] tab2 = { 192, 2, 3, 4, 5 };
        for (double v : tab2) {
            CalculMoyenne.ajouter(v);
        }
        System.out.println(CalculMoyenne.calculerMoyenne());
    }
}
