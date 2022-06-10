package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {
    private int force;
    private int pointsDeVie;

    public Gobelin() {
        // force entre 5 et 10
        this.force = new Random().nextInt(6) + 5;
        // vie entre 10 et 15
        this.pointsDeVie = new Random().nextInt(6) + 10;
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
