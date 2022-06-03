package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;

public class TestBanque {
    public static void main(String[] args) {
        // Compte compte1 = new Compte(1, 1000);
        // Compte compte2 = new Compte(2, 612.81);
        // System.out.println(compte1);
        // System.out.println(compte2);
        // Désormais, avec la méthode toString() sur la classe Compte, celle-ci affiche le numéro du compte et le solde
        ArrayList<Compte> listeComptes = new ArrayList<>();
        listeComptes.add(new Compte(1, 1000));
        listeComptes.add(new CompteTaux(2, 612.81, 0.05));
        for(Compte compte : listeComptes) {
            System.out.println(compte);
        }
    }
}
