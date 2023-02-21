package Chapter4;

import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total= 0;
        int counter;
                for(counter =1; counter <=10; counter++){
                    System.out.print("Enter " + grade(counter) + " grade = ");
                    int grade = input.nextInt();
                     total = total +grade;
                }
        System.out.println("Total is: "+total);
        int average = total/(counter-1);
        System.out.println("The average is: "+average);


    }
    private static String grade(int counter) {
        if (counter == 1) {
            return "first";
        }
        if (counter == 2) {
            return "second";
        }
        if (counter == 3) {
            return "third";
        }
        if (counter == 4) {
            return "fourth";
        }
        if (counter == 5) {
            return "fifth";
        }
        if (counter == 6) {
            return "sixth";
        }
        if (counter == 7) {
            return "seventh";
        }
        if (counter == 8) {
            return "eighth";
        }
        if (counter == 9) {
            return "ninth";

        }
        if (counter == 10) {
            return "tenth";
        }

        return null;
    }

}

