package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(
			String[] args) {
		try (Scanner scanner = new Scanner(
				System.in)) {
			int nb;
			do {
				System.out.println(
						"enter a number between 1 and 10 : ");
				nb = scanner.nextInt();
			} while (nb <= 1
					|| nb >= 10);
			for (int i = 0; i <= 10; i++) {
				System.out.println(nb
						+ " x " + i
						+ " = "
						+ nb * i);
			}
		}

	}

}
