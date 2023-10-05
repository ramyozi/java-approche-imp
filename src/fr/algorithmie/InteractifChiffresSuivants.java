package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter a number : ");
			int nb = scanner.nextInt();
			System.out.println("the next 10 numbers are : ");
			for (int i = 1; i <= 10; i++) {
				if (i != 10) {
					System.out.print(nb + i + ", ");
				} else {
					System.out.print(nb + i);

				}

			}
		}

	}

}
