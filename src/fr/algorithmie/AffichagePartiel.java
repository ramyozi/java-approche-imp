package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

        System.out.println("Affichage partiel des éléments du tableau :");
        System.out.println("-----------------------------------");

        System.out.println("Nombres supérieurs à 3 :");
        printNumbersGreaterThanThree(array);

        System.out.println("\nNombres pairs :");
        printEvenNumbers(array);

        System.out.println("\nValeurs aux indices pairs :");
        printValuesAtEvenIndices(array);

        System.out.println("\nNombres impairs :");
        printOddNumbers(array);
    }

    public static void printNumbersGreaterThanThree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 3) {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println();
    }

    public static void printValuesAtEvenIndices(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println();
    }

}
