package Chapter7;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers [0] = 9;
        numbers [1] = 8;
        numbers [9] = 100;
        numbers [4] = 29;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers [9]);
        System.out.println(numbers[1] +" "+numbers[4]+" "+numbers[9]);
    }
}
