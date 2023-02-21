package Chapter5;

import java.util.Scanner;

public class CompoundInterestModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount for principal: ");
        double principal = input.nextDouble();
         double rate = 0.05;
        System.out.println("Rate for 5%");
        System.out.printf("%s %n %n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount,rate);
        }
        rate = 0.06;
        System.out.println("Rate for 6%");
        System.out.printf("%s %n %n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount,rate);
        }
        rate = 0.07;
        System.out.println("Rate for 7%");
        System.out.printf("%s %n %n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount,rate);
        }
        rate = 0.08;
        System.out.println("Rate for 8%");
        System.out.printf("%s %n %n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount,rate);
        }
        rate = 0.09;
        System.out.println(" Rate for 9%");
        System.out.printf("%s %n %n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount,rate);
        }
        rate =0.10;
        System.out.println("Rate for 10%");
        System.out.printf("%s %n %n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount,rate);
        }





        }


    }

