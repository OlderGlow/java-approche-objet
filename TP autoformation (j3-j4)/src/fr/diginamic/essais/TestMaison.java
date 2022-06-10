package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Piece WC = new WC(10, 1);
        Piece chambre1 = new Chambre(14, 2);
        Piece chambre2 = new Chambre(12, 0);
        Piece salleDeBain = new SalleDeBain(6, 1);
        Piece cuisine = new Cuisine(9, 0);
        Piece salon = new Salon(41, 0);
        Maison.ajouterPiece(WC);
        Maison.ajouterPiece(chambre1);
        Maison.ajouterPiece(chambre2);
        Maison.ajouterPiece(salleDeBain);
        Maison.ajouterPiece(cuisine);
        Maison.ajouterPiece(salon);
        System.out.println(Maison.getSuperficieTotale());
        System.out.println(Maison.getSuperficieParEtage(0));
        System.out.println(Maison.getSuperficieParEtage(1));
        System.out.println(Maison.getSuperficieParEtage(2));
        System.out.println(Maison.getSuperficieParTypePiece("WC"));
    }
}
