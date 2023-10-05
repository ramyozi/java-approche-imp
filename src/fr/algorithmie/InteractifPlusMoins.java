package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		int min = 1;
		int max = 100;

		int nb_random = (int) Math
				.floor(Math.random() * (max - min + 1) + min);
		int nb_player;
		try (Scanner scanner = new Scanner(System.in)) {

			do {
				System.out.print("Enter a number: ");
				nb_player = scanner.nextInt();
				if (nb_player>nb_random) {
					System.out.println("Lower :)");
				}
				else if(nb_player<nb_random){
					System.out.println("Higher :)");
				}else {
					System.out.println("Congrats, you've Won !! the number was in fact " + nb_random);
				}

			} while (nb_player != nb_random);
		}
	}
}
