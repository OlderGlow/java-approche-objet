package utils;

public class ConversionNombre {
    private static String chaine = "12";
    private static int entier = Integer.parseInt(chaine);
    private static int a = 12;
    private static int b = 371;

    public static void main(String[] args) {
        int result = Integer.max(a, b);
        System.out.println(result);
    }

}
