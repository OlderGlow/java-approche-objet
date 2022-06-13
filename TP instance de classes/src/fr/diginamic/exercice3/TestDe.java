package fr.diginamic.exercice3;

public class TestDe {
    public static void main(String[] args) {
        De de = new De(6);
        System.out.println(de.getResultat());

        int nbJets = 0;
        int resultat = 0;
        int maxResultat = 10;
        while (resultat != 6 && maxResultat != 0) {
            resultat = de.getResultat();
            nbJets++;
            maxResultat--;
        }
        System.out.printf("Nombre de jets pour obtenir un 6 : %d\n", nbJets);
    }
}
