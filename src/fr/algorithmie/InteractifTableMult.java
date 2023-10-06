package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int nb;
            do {
                System.out.println("Welcome to the Interactive Multiplication Table!");
                System.out.print("Enter a number between 1 and 10: ");
                nb = scanner.nextInt();
            } while (nb < 1 || nb > 10);

            System.out.println("Great choice! Here's the multiplication table for " + nb + ":");

            printMultiplicationTable(nb);
        }
    }

    public static void printMultiplicationTable(int nb) {
        System.out.println("===============================================");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", nb, i, nb * i);
        }
        System.out.println("===============================================");
    }
}
