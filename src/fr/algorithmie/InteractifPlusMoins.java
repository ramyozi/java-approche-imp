package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        int nb_random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int nb_player;
        int attempts = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenue dans le jeu Plus ou Moins !");
            System.out.println("Devinez le nombre entre " + min + " et " + max + ".");

            do {
                System.out.print("Entrez un nombre : ");
                nb_player = scanner.nextInt();
                attempts++;

                if (nb_player > nb_random) {
                    System.out.println("C'est moins :)");
                } else if (nb_player < nb_random) {
                    System.out.println("C'est plus :)");
                } else {
                    System.out.println("Félicitations, vous avez gagné !! Le nombre était en effet " + nb_random);
                    System.out.println("Vous avez réussi en " + attempts + " tentatives !");
                }
            } while (nb_player != nb_random);
        } catch (java.util.InputMismatchException e) {
            System.err.println("Erreur : Entrez un nombre valide !");
        }
    }
}
