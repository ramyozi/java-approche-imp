package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		System.out.println("Éléments du tableau :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "|");
		}
		System.out.println("");
		
        System.out.println("Éléments dans l'ordre inverse :");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + "|");
		}
		System.out.println("");
		
		
		int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
		
        System.out.println("Éléments du tableau copié (arrayCopy) :");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println();
	}

}
