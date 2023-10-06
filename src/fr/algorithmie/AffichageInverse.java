package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
        System.out.println("Bienvenue dans le programme d'affichage inverse de tableau !");
        System.out.println("-----------------------------------");

        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

        System.out.println("Voici les éléments du tableau initial :");
        printArray(array);

        System.out.println("\nMaintenant, voici les éléments dans l'ordre inverse :");
        printReverseArray(array);

        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

        System.out.println("\nCopie réussie ! Voici les éléments du tableau copié (arrayCopy) :");
        printArray(arrayCopy);
    }

    //  array 
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println(); 
    }

    //  array in reverse 
    public static void printReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println(); 
    }

}
