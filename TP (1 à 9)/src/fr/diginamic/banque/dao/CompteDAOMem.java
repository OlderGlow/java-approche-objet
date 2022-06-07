package fr.diginamic.banque.dao;

import fr.diginamic.banque.entites.Compte;

import java.util.ArrayList;
import java.util.Arrays;

public class CompteDAOMem implements CompteDAO {
    Compte[] comptes = new Compte[0];

    @Override
    public Compte[] lister() {
        return comptes;
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        ArrayList<Compte> liste = new ArrayList<>(Arrays.asList(comptes));
        liste.add(nvCompte);
        comptes = liste.toArray(new Compte[0]);
    }

    @Override
    public boolean supprimer(String numero) {
        ArrayList<Compte> liste = new ArrayList<>(Arrays.asList(comptes));
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getNumeroCompte() == Integer.parseInt(numero)) {
                liste.remove(i);
                comptes = liste.toArray(new Compte[0]);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existe(String numero) {
        for (Compte compte : comptes) {
            if (compte.getNumeroCompte() == Integer.parseInt(numero)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Compte getCompte(String numero) {
        for (Compte compte : comptes) {
            if (compte.getNumeroCompte() == Integer.parseInt(numero)) {
                return compte;
            }
        }
        return null;
    }
}
