package fr.diginamic.utils;


import fr.diginamic.entite.Ville;

import java.util.Comparator;

public class ComparatorVille implements Comparator<Ville> {
    @Override
    public int compare(Ville v1, Ville v2) {
        if (v2.getPopulation()>v1.getPopulation()) {
            return 1;
        }
        else if (v2.getPopulation()<v1.getPopulation()) {
            return -1;
        }
        return 0;
    }
}

