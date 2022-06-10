package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {
    private int force;
    private int pointsDeVie;
    private int score;

    public Personnage() {
        this.force = new Random().nextInt(6) + 12;
        this.pointsDeVie = new Random().nextInt(31) + 20;
        this.score = 0;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void combattre(Creature creature) {
        do {
            if(this.pointsDeVie > 0) {
                int attaquePersonnage = this.force + new Random().nextInt(10) + 1;
                int attaqueCreature = creature.getForce() + new Random().nextInt(10) + 1;
                if (attaquePersonnage > attaqueCreature) {
                    creature.setPointsDeVie(creature.getPointsDeVie() - attaquePersonnage);
                } else {
                    this.setPointsDeVie(this.getPointsDeVie() - attaqueCreature);
                }
            }
        } while (this.pointsDeVie > 0 && creature.getPointsDeVie() > 0);
    }

    @Override
    public String toString() {
        return "Personnage [force=" + force + ", pointsDeVie=" + pointsDeVie + ", score=" + score + "]";
    }
}
