package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0); System.out.println("Premier caractère: " + premierCaractere);
        System.out.println("Taille de la chaine: " + chaine.length());
        System.out.println("Le premier caractère ; se trouve à la position " + chaine.indexOf(';'));
        System.out.println("Le nom de famille de la personne est " + chaine.substring(0, chaine.indexOf(';')));
        System.out.println("Le nom de famille en majuscule est " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());
        System.out.println("Le nom de famille en minuscule est " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());
        String[] tab = chaine.split(";");
        System.out.println(Arrays.toString(tab));
        Salarie salarie = new Salarie(tab[0], tab[1], Double.parseDouble(tab[2].replace(" ", "")));
        System.out.println(salarie);
    }
}
