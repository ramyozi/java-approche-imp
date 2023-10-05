package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: " );
			int number = scanner.nextInt();

			
            double a = Math.pow(1 + Math.sqrt(5), number);
            double b = Math.pow(2, number) * Math.sqrt(5);
            
            double result = a / b;

            System.out.println("Result: " + result);

		}
	}

}
