package fr.algorithmie;

public class RechercheMin {

	public static void main(
			String[] args) {
		int[] numbers = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 int numberMin = numbers[0];
		 for (int number : numbers) {
			 if(number < numberMin) {
				 numberMin = number;
			 }
		 }
		 System.out
				.println("le plus petit élément du tableau: " + numberMin);

	}

}
