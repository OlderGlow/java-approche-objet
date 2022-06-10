package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double result1 = Operations.calcul(5, 10, '+');
        double result2 = Operations.calcul(5, 10, '-');
        double result3 = Operations.calcul(5, 10, '*');
        double result4 = Operations.calcul(5, 10, '/');
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
