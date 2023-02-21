package HolidayProjects;

import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        CheckOut prince = new CheckOut();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer's Name: ");
        String customersName = input.nextLine();
        System.out.println(prince.purchaseHistory());
        System.out.println(prince.cashierDetails());
        System.out.println(prince.generateReceipt());
        System.out.println(prince.printReceipt());

    }
}
