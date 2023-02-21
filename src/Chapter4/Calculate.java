package Chapter4;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        if (number2 < 0) specialNegativeExponentialCase(number1, number2);
        else {
            int result = 1;
            for (int counter = 1; counter <= number2; counter++) {
                result *= number1;
            }
            System.out.println("Answer is: " + result);
        }
    }

    private static void specialNegativeExponentialCase(int number1, int number2) {
        int result =1;
        number2*=-1;
        for(int counter = 0;counter <number2;counter++){
            result*=number1;
        }
        System.out.println("Answer is: "+1 + "/" +result);
    }



         }



