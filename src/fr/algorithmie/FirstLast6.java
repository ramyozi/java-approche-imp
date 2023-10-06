package fr.algorithmie;

public class FirstLast6 {

    public static void main(String[] args) {
        int[] tableau = {3, 4, 6, 1, 7, 5, 11};
        
        boolean resultat = tableau.length > 0 && (tableau[0] == 6 || tableau[tableau.length - 1] == 6);
        
        System.out.println("Bienvenue dans le programme de vérification si le premier ou le dernier élément est égal à 6 !");
        System.out.println("-----------------------------------");
        
        System.out.println("Tableau :");
        printArray(tableau);
        
        System.out.println("\nLe premier ou le dernier élément est-il égal à 6 ? " + resultat);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }
}
