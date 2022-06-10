package fr.diginamic.operations;

public class CalculMoyenne {
    static double[] tab;

    public static void ajouter(double v) {
        if (tab == null) {
            tab = new double[1];
            tab[0] = v;
        } else {
            double[] tab2 = new double[tab.length + 1];
            System.arraycopy(tab, 0, tab2, 0, tab.length);
            tab2[tab2.length - 1] = v;
            tab = tab2;
        }
    }

    public static double calculerMoyenne() {
        double moyenne = 0;
        for (double v : tab) {
            moyenne += v;
        }
        return moyenne / tab.length;
    }


}
