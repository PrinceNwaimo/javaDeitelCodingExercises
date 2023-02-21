package Chapter2;
/* (Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93*/

import java.util.Scanner;

public class Trial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 1000: ");
        int integer = input.nextInt();
        int digit1 = integer/100 % 10;
        int digit2 = integer/10%10;
        int digit3 = integer%10;
        System.out.println(digit1+" "+digit2+" "+digit3);
        System.out.println(digit1 + digit2 + digit3);

    }
}
