package Chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        //int [][] numbers = new int [3][3];
        int[][] numbers={{1,2,3,},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        System.out.println(Arrays.deepToString(numbers));
        System.out.println("     ");
        System.out.println("Example 2");
        for (int[]row:numbers) {
            System.out.println(Arrays.toString(row));

        }
    }
}
