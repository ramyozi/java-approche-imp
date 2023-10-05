package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter position N in the Fibonacci sequence : ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("N can't be a negative number.");
            } else {
                long result = fibonacci(n);
                System.out.println("The number at position N in the Fibonacci sequence is : " + result);
            }
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long[] fibArray = new long[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }
	}


