package fr.algorithmie;

public class CalculMoyenne {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int somme = 0;
        for (int i = 0; i < array.length; i++) {
            somme = somme + array[i];
        }

        double moyenne = (double) somme / array.length;

        System.out.println("Bienvenue dans le programme de calcul de moyenne !");
        System.out.println("-----------------------------------");
        System.out.println("Tableau d'entiers :");
        printArray(array);
        System.out.println("\nLa moyenne des éléments du tableau : " + moyenne);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println(); 
    }
}
