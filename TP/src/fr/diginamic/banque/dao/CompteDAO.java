package fr.diginamic.banque.dao;

import fr.diginamic.banque.entites.Compte;

public interface CompteDAO {
    Compte[] lister();
    void sauvegarder(Compte nvCompte);
    boolean supprimer(String numero);
    boolean existe(String numero);
    Compte getCompte(String numero);
}
