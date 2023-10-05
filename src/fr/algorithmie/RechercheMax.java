package fr.algorithmie;

public class RechercheMax {

	public static void main(
			String[] args) {
		 int[] numbers = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 int numberMax = numbers[0];
		 for (int number : numbers) {
			 if(number > numberMax) {
				 numberMax = number;
			 }
		 }
		 System.out
				.println("le plus grand élément du tableau: " + numberMax);
	}

}
