package Chapter2;
/*Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days. Here is a sample run*/

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number in minutes: ");
        int minutes = input.nextInt();
        int years = minutes/525600 ;
        int days = minutes%525600/1440;
        System.out.println(minutes+"minutes is approximately"+" "+years+"years"+" "+ "and"+" " +days+"days");
    }
}
