package Chapter2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kilogram: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in metres: ");
        double height = input.nextDouble();

        double weightInKilograms = weight;
        double heightInMeters = height;
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}


