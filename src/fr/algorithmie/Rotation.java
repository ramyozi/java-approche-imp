package fr.algorithmie;

public class Rotation {

	public static void main(
			String[] args) {
		int[] tableau = {3, 4, 6, 1, 7, 5, 11 };
		int[]temp = new int[tableau.length];

		for (int i = 0 ; i<tableau.length ; i++) {
			temp[i] = tableau[tableau.length-1-i];
		}
		
		System.out
		.println("Avant rotation" );
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + "|");
		}
		System.out.println("");

		
		System.out
		.println("Apres rotation : " );
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "|");
		}
		System.out.println("");

	}

}
