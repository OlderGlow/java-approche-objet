package fr.diginamic.essais;

import fr.diginamic.entites.Carre;
import fr.diginamic.entites.Cercle;
import fr.diginamic.entites.Rectangle;
import fr.diginamic.formes.Forme;

public class AffichageForme {
    public static void main(String[] args) {
        Forme carre = new Carre(10);
        System.out.println(carre);
        Forme cercle = new Cercle(10);
        System.out.println(cercle);
        Forme rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
    }
}
