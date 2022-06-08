package listes.exercice1;

import java.util.ArrayList;
import java.util.Iterator;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            liste.add(i);
        }
        for (Integer integer : liste) {
            System.out.println(integer);
        }
    }
}
