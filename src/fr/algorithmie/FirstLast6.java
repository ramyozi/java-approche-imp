package fr.algorithmie;

public class FirstLast6 {

	public static void main(
			String[] args) {
		int[] tableau = {3, 4, 6, 1, 7, 5, 11 };
		
        boolean resultat = tableau.length > 0 && (tableau[0] == 6 || tableau[tableau.length - 1] == 6);
        System.out
				.println("resultat (FirstLast6): " + resultat);

	}

}
