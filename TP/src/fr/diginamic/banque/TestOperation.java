package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.Objects;

public class TestOperation {
    public static void main(String[] args) {
        double montant = 0;
        Operation[] operations = {
                new Credit("02/06/2022", 1200),
                new Credit("01/06/2022", 300),
                new Debit("01/06/2022", 400),
                new Debit("02/06/2022", 500),
        };

        for(Operation operation : operations) {
            if(Objects.equals(operation.getType(), "CREDIT")) {
                montant += operation.getMontant();
            } else {
                montant -= operation.getMontant();
            }
            System.out.println(operation.getType() + " " + operation.getDate() + " " + operation.getMontant() + "€");
        }
        System.out.println("Solde : " + montant + "€");
    }
}
