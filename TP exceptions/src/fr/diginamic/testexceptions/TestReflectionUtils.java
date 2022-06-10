package fr.diginamic.testexceptions;

import tris.exercice3.Ville;

import javax.management.ReflectionException;


public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException, ReflectionException {
        Ville ville = new Ville("Paris", 1100000);
        ReflectionUtils.afficherAttributs(ville); // OK
        ReflectionUtils.afficherAttributs(null); // KO (obj is null, NullPointerException)
    }
}
