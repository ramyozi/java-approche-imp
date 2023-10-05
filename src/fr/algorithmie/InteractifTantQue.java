package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
	public static void main(
			String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int nb;
			do {
				System.out
						.println("enter a number between 1 and 10 : ");
				 nb = scanner.nextInt() ;			
			}while(nb<=1 || nb>=10);
			System.out
					.println("you typed the number " + nb + "(END)");
		}
	}

}
