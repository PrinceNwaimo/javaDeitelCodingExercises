package Chapter2;

import java.util.Scanner;

/*(Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print
Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? What happens when you enter a number with fewer than five
digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
need to use both division and remainder operations to “pick off” each digit.]*/
public class Snap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();
        int digit1= number/10000%10;
        int digit2 = number/1000%10;
        int digit3= number/100%10;
        int digit4= number/10%10;
        int digit5=number%10;
            System.out.println(digit1+"   "+digit2+"   "+digit3+"   "+digit4+"   "+digit5);


        }


    }

