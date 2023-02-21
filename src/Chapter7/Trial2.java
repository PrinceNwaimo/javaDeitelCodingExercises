package Chapter7;

import java.util.Arrays;

public class Trial2 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int counter = 1;
            for (int row = 0; row < numbers.length; row++) {
                System.out.println(Arrays.deepToString(numbers));
                for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column]=counter;
                counter++;
                Arrays.deepToString(numbers);

            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
