package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = new int[5];
            int size = 0;

            System.out.println("Welcome to the Fun Number Storage Game!");
            System.out.println("*****************************************");

            while (true) {
                showMenu();
                int choice = getUserChoice(scanner);

                switch (choice) {
                    case 1:
                        if (size == array.length) {
                            int[] newArray = new int[array.length * 2];
                            System.arraycopy(array, 0, newArray, 0, array.length);
                            array = newArray;
                        }

                        System.out.print("Enter a number to add: ");
                        int number = scanner.nextInt();
                        array[size] = number;
                        size++;
                        System.out.println("Number added successfully!");
                        break;

                    case 2:
                        if (size == 0) {
                            System.out.println("The storage chest is empty.");
                        } else {
                            System.out.println("Numbers in the storage chest:");
                            for (int i = 0; i < size; i++) {
                                System.out.print(array[i] + " | ");
                            }
                            System.out.println();
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        }
    }

    private static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add a Number");
        System.out.println("2. Display Stored Numbers");
        System.out.print("Choose an option: ");
    }

    private static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}
