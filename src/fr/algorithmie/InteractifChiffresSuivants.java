package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenue dans le programme des chiffres suivants !");
            System.out.println("-----------------------------------");

            System.out.print("Entrez un nombre : ");
            int nb = scanner.nextInt();
            System.out.println("Les 10 prochains nombres sont : ");

            for (int i = 1; i <= 10; i++) {
                if (i != 10) {
                    System.out.print(nb + i + ", ");
                } else {
                    System.out.print(nb + i);
                }
            }

            System.out.println("\nAmusez-vous bien !");
        } catch (java.util.InputMismatchException e) {
            System.err.println("Erreur : Entrez un nombre valide !");
        }
    }
}
