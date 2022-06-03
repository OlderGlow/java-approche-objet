package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1, 1000);
        System.out.println(compte1);
        // Affiche uniquement le pointer. C'est normal : pas de méthode toString() dans la classe Compte.
    }
}
