package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenue dans le jeu du Plus Grand Nombre !");
            System.out.println("-----------------------------------");

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < 10; i++) {
                System.out.print("Entrez un nombre : ");
                int nb = scanner.nextInt();

                if (nb > max) {
                    max = nb;
                    System.out.println("Nouveau record ! Vous avez trouvé un nombre encore plus grand.");
                } else {
                    System.out.println("Essayez de trouver un nombre plus grand.");
                }
            }

            System.out.println("\nBravo ! Le plus grand nombre que vous avez trouvé est : " + max);
            System.out.println("Vous êtes un véritable champion !");
        } catch (java.util.InputMismatchException e) {
            System.err.println("Erreur : Entrez un nombre valide !");
        }
    }
}
