package fr.diginamic.banque;

import fr.diginamic.banque.dao.CompteDAOMem;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestBanque {

    static CompteDAOMem compteDAOMem = new CompteDAOMem();
    public static void main(String[] args) {
       init();
    }

    public static void init() {
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            showMenu();
            choix = sc.nextInt();
            switch (choix) {
                case 1 -> {
                    System.out.println("Liste des comptes :");
                    Compte[] comptes = compteDAOMem.lister();
                    if (comptes.length == 0) {
                        System.err.println("Aucun compte n'a encore été enregistré");
                    } else {
                        for (Compte compte : comptes) {
                            System.out.println(compte);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Saisir un numéro de compte :");
                    int numero = sc.nextInt();
                    System.out.println("Saisir le solde initial :");
                    double solde = sc.nextDouble();
                    System.out.println("Saisir le type de compte : (1: Normal, 2: Intérêts)");
                    int type = sc.nextInt();
                    if (type == 1) {
                        compteDAOMem.sauvegarder(new Compte(numero, solde));
                    } else if (type == 2) {
                        System.out.println("Saisir le taux d'intérêts :");
                        double taux = sc.nextDouble();
                        compteDAOMem.sauvegarder(new CompteTaux(numero, solde, taux));
                    } else {
                        System.err.println("Type de compte inconnu");
                    }
                }
                case 3 -> {
                    System.out.println("Saisir un numéro de compte :");
                    sc.nextLine();
                    String numeroCompte = sc.nextLine();
                    if (!compteDAOMem.existe(numeroCompte)) {
                        System.err.println("Compte introuvable");
                        break;
                    }
                    Compte actualCompte = compteDAOMem.getCompte(numeroCompte);
                    double actualMontant = actualCompte.getSoldeCompte();

                    System.out.println("Saisir le type d'opération : (1: Créditer, 2: Débiter)");
                    int type = sc.nextInt();
                    if (type == 1) {
                        sc.nextLine();
                        System.out.println("Saisir la date de l'opération :");
                        String date = sc.nextLine();
                        System.out.println("Saisir le montant à créditer :");
                        double montant = sc.nextDouble();
                        Credit credit = new Credit(date, montant);
                        actualCompte.setSoldeCompte((float) (actualMontant + credit.getMontant()));
                    } else if (type == 2) {
                        sc.nextLine();
                        System.out.println("Saisir la date de l'opération :");
                        String date = sc.nextLine();
                        System.out.println("Saisir le montant à débiter :");
                        double montant = sc.nextDouble();
                        Debit debit = new Debit(date, montant);
                        actualCompte.setSoldeCompte((float) (actualMontant - debit.getMontant()));
                    } else {
                        System.err.println("Type d'opération inconnu");
                    }
                }
                case 4 -> {
                    System.out.println("Saisir un numéro de compte :");
                    sc.nextLine();
                    String numeroCompte = sc.nextLine();
                    if (!compteDAOMem.existe(numeroCompte)) {
                        System.err.println("Compte introuvable");
                        break;
                    }
                    compteDAOMem.supprimer(numeroCompte);
                    System.out.println("Le compte a été supprimé");
                }
                case 99 -> {
                    System.out.println("Au revoir !");
                    sc.close();
                }
                default -> {
                    System.err.println("Choix incorrect");
                }
            }
        } while (choix != 99);
    }

    public static void showMenu(){
        System.out.println("***** Administration des comptes *****");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Ajouter un nouveau compte");
        System.out.println("3. Ajouter une opération à un compte");
        System.out.println("4. Supprimer un compte");
        System.out.println("99. Quitter");
        System.out.println("Votre choix :");
    }
}
