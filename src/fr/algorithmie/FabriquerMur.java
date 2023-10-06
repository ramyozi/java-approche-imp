package fr.algorithmie;

public class FabriquerMur {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le programme de construction d'un mur !");
        System.out.println("-----------------------------------");

        // Tests de vérification
        testerConstructionMur(3, 1, 8, true);
        testerConstructionMur(3, 1, 9, false);
        testerConstructionMur(3, 2, 10, true);
        testerConstructionMur(3, 2, 8, true);
        testerConstructionMur(3, 2, 9, false);
        testerConstructionMur(6, 1, 11, true);
        testerConstructionMur(6, 0, 11, false);
        testerConstructionMur(1, 4, 11, true);
        testerConstructionMur(0, 3, 10, true);
        testerConstructionMur(1, 4, 12, false);
        testerConstructionMur(3, 1, 7, true);
        testerConstructionMur(1, 1, 7, false);
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = (nbSmall + (nbBig * 5)) >= longueur;
        return resultat;
    }

    private static void testerConstructionMur(int nbSmall, int nbBig, int longueur, boolean expectedResult) {
        boolean result = fabriquerMur(nbSmall, nbBig, longueur);
        if (result == expectedResult) {
            System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") - OK");
        } else {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") - ÉCHEC");
        }
    }
}
