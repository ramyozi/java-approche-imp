package fr.algorithmie;

public class SommeDeTableaux {

    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        System.out.println("Bienvenue dans le monde de la Super-Somme !");
        System.out.println("🚀 Préparez-vous pour une somme sensationnelle 🚀");
        System.out.println("==============================================");

        System.out.println("Tableau 1 : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " | ");
        }
        System.out.println();

        System.out.println("Tableau 2 : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " | ");
        }
        System.out.println();

        int maxLength = Math.max(array1.length, array2.length);
        int[] sommeArray = new int[maxLength];

        for (int i = 0; i < array1.length; i++) {
            sommeArray[i] += array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            sommeArray[i] += array2[i];
        }

        System.out.println("Tableau qui contient la Super-Somme des deux tableaux : ");
        for (int element : sommeArray) {
            System.out.print(element + " | ");
        }
        System.out.println("\n");

        System.out.println("Félicitations pour cette Super-Somme ! Continuez à explorer le monde de la mathématique.");
    }

}
