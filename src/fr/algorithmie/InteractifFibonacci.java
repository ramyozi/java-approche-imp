package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenue dans le programme interactif de la suite de Fibonacci !");
            System.out.println("-----------------------------------");

            System.out.print("Entrez la position N dans la suite de Fibonacci : ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("N ne peut pas être un nombre négatif.");
            } else {
                long result = fibonacci(n);
                System.out.println("Le nombre à la position N dans la suite de Fibonacci est : " + result);
                System.out.println("C'est magique, n'est-ce pas ?!");
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("Erreur : Entrez une position valide !");
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long[] fibArray = new long[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }
}
