package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int communNum = countCommonElements(array1, array2);

        System.out.println("Bienvenue dans le programme de comparaison de tableaux !");
        System.out.println("-----------------------------------");
        System.out.println("Tableau 1 :");
        printArray(array1);
        System.out.println("\nTableau 2 :");
        printArray(array2);
        System.out.println("\nLe nombre d’éléments en commun : " + communNum);
    }

    public static int countCommonElements(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println(); 
    }
}
