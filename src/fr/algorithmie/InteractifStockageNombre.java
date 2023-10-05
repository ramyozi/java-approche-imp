package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] array = new int[5];
			int size = 0;

			while (true) {
				System.out.println("********************************");
				showMenu();
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					if (size == array.length) {
						int[] newArray = new int[array.length * 2];
						System.arraycopy(array, 0, newArray, 0,
								array.length);
						array = newArray;
					}

					System.out.print("Enter a number to add: ");
					int number = scanner.nextInt();
					array[size] = number;
					size++;
					System.out.println("Number added successfully.");
					break;

				case 2:
					if (size == 0) {
						System.out.println("The array is empty.");
					} else {
						System.out.println("Existing numbers:");
						for (int i = 0; i < size; i++) {
							System.out.print(array[i] + " | ");
						}
						System.out.println();
					}
					break;

				default:
					System.out.println(
							"Invalid choice. Please enter 1 or 2.");
				}
			}
		}
	}

	private static void showMenu() {
		System.out.println("Menu :");
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");
		System.out.print("Choisissez une option : ");

	}
}
