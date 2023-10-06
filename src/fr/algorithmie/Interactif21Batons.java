package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int batons = random.nextInt(16) + 15; 
            boolean tourJoueur = true; 

            System.out.println("Bienvenue au jeu des 21 Bâtons !");
            System.out.println("Règles : Prenez 1 à 3 bâtons à tour de rôle. Celui qui prend le dernier bâton perd.");
            System.out.println("Nombre de bâtons au départ : " + batons);

            while (batons > 0) {
                int maxRetrait = Math.min(3, batons); 
                if (tourJoueur) {
                    System.out.print("C'est votre tour. Combien de bâtons voulez-vous prendre (1-" + maxRetrait + ") ? ");
                    int choixJoueur = scanner.nextInt();
                    if (choixJoueur >= 1 && choixJoueur <= maxRetrait) {
                        batons -= choixJoueur;
                        System.out.println("Vous avez pris " + choixJoueur + " bâton(s). Il reste " + batons + " bâtons.");
                        tourJoueur = false;
                    } else {
                        System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et " + maxRetrait + ".");
                    }
                } else {
                    int choixOrdinateur = random.nextInt(maxRetrait) + 1;
                    System.out.println("C'est le tour de l'ordinateur. Il prend " + choixOrdinateur + " bâton(s).");
                    batons -= choixOrdinateur;
                    System.out.println("Il reste " + batons + " bâtons.");
                    tourJoueur = true;
                }
            }

            if (tourJoueur) {
                System.out.println("Félicitations, vous avez gagné ! L'ordinateur a pris le dernier bâton.");
            } else {
                System.out.println("Désolé, vous avez perdu ! Vous avez pris le dernier bâton.");
            }
        }
    }
}
