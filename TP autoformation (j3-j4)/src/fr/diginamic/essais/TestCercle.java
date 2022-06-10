package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(5);
        Cercle cercle2 = new Cercle(10);
        System.out.println(cercle1);
        System.out.println(cercle2);
        Cercle cercle3 = CercleFactory.createCercle(15);
        System.out.println(cercle3);
    }


}
