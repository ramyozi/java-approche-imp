package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        int[] tableau = {3, 4, 6, 1, 7, 5, 11};
        
        boolean resultat = tableau.length >= 1 && tableau[0] == tableau[tableau.length - 1];
        
        System.out.println("Bienvenue dans le programme de vérification des premiers et derniers éléments !");
        System.out.println("-----------------------------------");
        
        System.out.println("Tableau :");
        printArray(tableau);
        
        System.out.println("\nLe premier et le dernier élément sont-ils identiques ? " + resultat);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println(); 
    }
}
