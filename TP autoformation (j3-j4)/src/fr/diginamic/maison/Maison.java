package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
    public static ArrayList<Piece> pieces = new ArrayList<Piece>();

    public static void ajouterPiece(Piece piece) {
        if(piece == null) {
            throw new IllegalArgumentException("La pièce ne peut pas être null");
        }
        if(piece.getSuperficie() <= 0) {
            throw new IllegalArgumentException("La superficie ne peut pas être négative ou nulle");
        }
        if(piece.getNumeroEtage() < 0) {
            throw new IllegalArgumentException("Le numéro d'étage ne peut pas être négatif");
        }
        if(!pieces.contains(piece)) {
            pieces.add(piece);
        } else {
            System.out.println("La piece existe déjà");
        }
    }

    public static double getSuperficieTotale() {
        double superficieTotale = 0;
        for (Piece piece : pieces) {
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;
    }

    public static double getSuperficieParEtage(int numeroEtage) {
        double superficieParEtage = 0;
        for (Piece piece : pieces) {
            if (piece.getNumeroEtage() == numeroEtage) {
                superficieParEtage += piece.getSuperficie();
            }
        }
        return superficieParEtage;
    }

    public static double getSuperficieParTypePiece(String type) {
        double superficieParType = 0;
        for (Piece piece : pieces) {
            if (piece.getClass().getSimpleName().equals(type)) {
                superficieParType += piece.getSuperficie();
            }
        }
        return superficieParType;
    }

    public static int getNbPiecesParTypePiece(String type) {
        int nbPiecesParType = 0;
        for (Piece piece : pieces) {
            if (piece.getClass().getSimpleName().equals(type)) {
                nbPiecesParType++;
            }
        }
        return nbPiecesParType;
    }
}
