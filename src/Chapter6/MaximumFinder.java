package Chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        // create Scanner for input from command window
        Scanner input = new Scanner(System.in);
        // prompt for and input three floating-point values
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double
        // determine the maximum value
        // display maximum value
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: "+result);
    }

    // returns the maximum of its three double parameters
    public static double maximum(double x, double y, double z) {
        /* The keyword static enables the main method (another static method) to call maximum as shown in
line 18 without qualifying the method name with the class name MaximumFinder—static
methods in the same class can call each other directly. Any other class that uses maximum
must fully qualify the method name, as in MaximumFinder.maximum(10, 30, 20).*/
        double maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }

        // determine whether z is greater than maximumValue
        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
}