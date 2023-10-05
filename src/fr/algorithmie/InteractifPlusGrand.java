package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < 10; i++) {
				System.out.print("Enter a number: ");
				int nb = scanner.nextInt();

				if (nb > max) {
					max = nb;
				}
			}

			System.out
					.println("The greatest number you provided is " + max);
		}

	}

}
