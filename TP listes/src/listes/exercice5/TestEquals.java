package listes.exercice5;

public class TestEquals {
    public static void main(String[] args) {
        // Vérifiez que la méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs
        Ville ville1 = new Ville("Nice", 343000);
        Ville ville2 = new Ville("Nice", 343000);
        System.out.println("La méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs : " + ville1.equals(ville2));

        // Vérifiez maintenant que la méthode retourne false si vous changez un des attributs
        ville1.setNom("NICE");
        System.out.println("La méthode equals retourne false si vous changez un des attributs : " + ville1.equals(ville2));

        // Faites le test maintenant en utilisant l’opérateur == avec les mêmes attributs, puis avec des attributs différents
        System.out.println("La méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs : " + (ville1 == ville2));
        ville1.setNom("NICE");
        System.out.println("La méthode equals retourne false si vous changez un des attributs : " + (ville1 == ville2));

        /*
        * La méthode == retourne false dans tous les cas : c'est normal, ils ne possèdent pas le même pointeur.
         */
    }
}
