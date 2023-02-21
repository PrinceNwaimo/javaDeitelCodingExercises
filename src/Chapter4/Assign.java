package Chapter4;

import java.util.Scanner;

import static Chapter4.GradeNumber.*;

public class Assign {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeNumber aby = new GradeNumber();
        int total = 0;
        int counter;
        for(counter = 1; counter<= 10; counter ++) {
            System.out.printf("Enter %s grade: ",aby.Grade(counter));
            int grade = input.nextInt();
            total = total + grade;
        }
            System.out.println("total is: "+total);
            double average = (double) total/(counter-1);
            /*casting is taking place here*/
            System.out.println("average is: "+average);

    }


    }


