package fr.algorithmie;

public class Rotation {

    public static void main(String[] args) {
        int[] tableau = {3, 4, 6, 1, 7, 5, 11};
        int[] temp = new int[tableau.length];

        System.out.println("Bienvenue au Tournoi de Rotation !");
        System.out.println("🌀 Les concurrents s'affrontent dans une rotation spectaculaire 🌀");
        System.out.println("==============================================================");

        System.out.println("Avant le tournoi, voici l'ordre de départ :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " | ");
        }
        System.out.println("\n");

        for (int i = 0; i < tableau.length; i++) {
            temp[i] = tableau[tableau.length - 1 - i];
        }

        System.out.println("Le tournoi est terminé ! Voici le résultat après une rotation époustouflante :");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " | ");
        }
        System.out.println("\n");

        System.out.println("Félicitations au champion de la Rotation !");
    }

}
