package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenue dans le programme interactif de somme arithmétique !");
            System.out.println("-----------------------------------");

            System.out.print("Entrez un nombre : ");
            int nb = scanner.nextInt();
            int sum = 0;

            if (nb < 0) {
                System.out.println("Le nombre doit être positif ou nul.");
            } else {
                for (int i = 1; i <= nb; i++) {
                    sum += i;
                }

                System.out.println("La somme de tous les entiers entre 1 et " + nb + " : " + sum);
                System.out.println("C'est magique, n'est-ce pas ?!");
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("Erreur : Entrez un nombre valide !");
        }
    }
}
