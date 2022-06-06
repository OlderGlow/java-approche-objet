package fr.diginamic.banque.dao;

import fr.diginamic.banque.entites.Compte;

import java.util.ArrayList;

public class CompteDAOMem implements CompteDAO {
    ArrayList<Compte> listeComptes = new ArrayList<>();

    @Override
    public Compte[] lister() {
        return listeComptes.toArray(new Compte[0]);
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        listeComptes.add(nvCompte);
    }

    @Override
    public boolean supprimer(String numero) {
        for (Compte compte : listeComptes) {
            if (Integer.parseInt(numero) == compte.getNumeroCompte()) {
                listeComptes.remove(compte);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existe(String numero) {
        for (Compte compte : listeComptes) {
            if (Integer.parseInt(numero) == compte.getNumeroCompte()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Compte getCompte(String numero) {
        for (Compte compte : listeComptes) {
            if (Integer.parseInt(numero) == compte.getNumeroCompte()) {
                return compte;
            }
        }
        return null;
    }
}
