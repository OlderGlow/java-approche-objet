package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Bataclan", 1000);
        theatre.inscrire(10, 20);
        theatre.inscrire(50, 20);
        theatre.inscrire(900, 20);
        theatre.inscrire(200, 20);
        System.out.println(theatre);
    }
}
