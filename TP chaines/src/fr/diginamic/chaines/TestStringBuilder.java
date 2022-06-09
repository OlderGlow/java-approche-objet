package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = "";
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println("Temps d'exécution : " + (end - start) + " ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            string += i;
        }
        end = System.currentTimeMillis();
        System.out.println("Temps d'exécution : " + (end - start) + " ms");
    }
}
