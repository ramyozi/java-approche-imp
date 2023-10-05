package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter a number : ");
			int nb = scanner.nextInt();
			int sum = 0;
			
			
			for (int i = 1; i <= nb; i++) {
				sum += i;
			}
			System.out.println("the sum of all integers between 1 and " + nb + " : " + sum);
		}

	}

}
