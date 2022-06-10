package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {
    private int force;
    private int pointsDeVie;

    public Loup() {
        this.force = new Random().nextInt(6) + 3;
        this.pointsDeVie = new Random().nextInt(6) + 5;
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
