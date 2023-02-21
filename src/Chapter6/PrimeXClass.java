package Chapter6;

import java.util.Scanner;

public class PrimeXClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        primeNumberFinder(number);
        usePrime(number);
    }

    private static void primeNumberFinder(int number) {
        boolean prime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                prime = true;
                break;

            }
        }
        if (!prime)
            System.out.println("This is a prime number " + number);
        else
            System.out.println("This is not a prime number");

    }


    private static void usePrime(int number) {
        if (number < 10000) {

            int numberOfPrimeNumbers = 0;
            for (int counter = 1; counter <= 10000; ++counter) {
                boolean prime = false;
                for (int i = 2; i <= counter / 2; ++i) {
                    if (counter % i == 0) {
                        prime = true;
                        break;

                    }

                }
                if (!prime) {

                    System.out.println("This is a prime number " + counter);
                    numberOfPrimeNumbers++;
                }

            }

            System.out.println(numberOfPrimeNumbers);


        }


    }
}