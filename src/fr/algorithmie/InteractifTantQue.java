package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int nb;
            do {
                System.out.println("Welcome to the Interactive Number Zone!");
                System.out.print("Enter a number between 1 and 10: ");
                nb = scanner.nextInt();
            } while (nb < 1 || nb > 10);

            System.out.println("You've entered the magical number " + nb + "!");
            System.out.println("It's a fantastic choice! Enjoy the journey!");
        }
    }

}
