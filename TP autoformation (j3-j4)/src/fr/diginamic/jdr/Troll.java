package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

    private int force;
    private int pointsDeVie;

    public Troll() {
        // force entre 10 et 15
        this.force = new Random().nextInt(6) + 10;
        // vie entre 20 et 30
        this.pointsDeVie = new Random().nextInt(6) + 20;
    }

    @Override
    public int getForce() {
        return force;
    }

    @Override
    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    @Override
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }
}
