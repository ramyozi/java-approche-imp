package fr.algorithmie;

public class RechercheMin {

    public static void main(String[] args) {
        int[] numbers = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int numberMin = numbers[0];

        System.out.println("Bienvenue, Chasseur de Primes !");
        System.out.println("🌟 Partez à la recherche de la Prime Minimale 🌟");
        System.out.println("==================================");

        for (int number : numbers) {
            if (number < numberMin) {
                numberMin = number;
            }
        }

        System.out.println("🎉 Félicitations ! Vous avez découvert la Prime Minimale : " + numberMin + " 🎉");
        System.out.println("Continuez à chasser d'autres primes !");
    }

}
