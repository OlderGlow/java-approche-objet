package fr.diginamic.exercice3;

public class De {
    private final int max;

    public De(int max) {
        this.max = max;
    }

    public int getResultat() {
        return 1 + (int) (Math.random() * max);
    }
}

