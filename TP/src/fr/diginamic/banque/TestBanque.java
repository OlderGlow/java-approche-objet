package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1, 1000);
        System.out.println(compte1);
        // Désormais, avec la méthode toString() sur la classe Compte, celle-ci affiche le numéro du compte et le solde
    }
}
