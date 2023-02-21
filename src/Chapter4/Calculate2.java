package Chapter4;

import java.util.Scanner;

public class Calculate2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        double sumOfInverseFactorial = 0 ;
        for(int i=1;i<=number;i++){
            sumOfInverseFactorial+=(1/(double)i);

        }
        System.out.println(sumOfInverseFactorial);

        }

    }

