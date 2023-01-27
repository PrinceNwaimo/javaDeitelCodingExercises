package HolidayProjects;

import java.util.Scanner;

public class CreditCardApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditCardValidator prince = new CreditCardValidator();
        System.out.print("Hello, kindly enter card details to verify: ");
        long cardNumber = input.nextLong();
        System.out.println("Credit card Number:" +cardNumber );
        System.out.println("Credit card Type :" +(prince.cardType(cardNumber)));
        System.out.println(" Credit Card Digit length: " +(prince.theSize((long)cardNumber)));
        System.out.println("Credit card validity status: "+(prince.isValid(cardNumber) ?"valid":"invalid"));
    }
}
