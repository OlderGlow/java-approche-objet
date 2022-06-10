package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, Character operator){
        double resultat = 0;
        switch (operator) {
            case '+' -> resultat = a + b;
            case '-' -> resultat = a - b;
            case '*' -> resultat = a * b;
            case '/' -> resultat = a / b;
            default -> System.out.println("Opérateur inconnu");
        }
        return resultat;
    }
}
