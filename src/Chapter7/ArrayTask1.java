package Chapter7;
import java.util.*;
public class ArrayTask1 {


        public static void main(String[] args) {
            int[] numbers = {2,4,5,9};
            int n = numbers.length;

            // Calculate the sum of all numbers in the array
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += numbers[i];
            }

            // Create an array to store the sums of all subarrays with one number removed
            int[] sums = new int[n];
            for (int i = 0; i < n; i++) {
                sums[i] = sum - numbers[i];
            }

            // Find the index of the highest and lowest sums
            int maxIndex = 0;
            int minIndex = 0;
            for (int i = 1; i < n; i++) {
                if (sums[i] > sums[maxIndex]) {
                    maxIndex = i;
                }
                if (sums[i] < sums[minIndex]) {
                    minIndex = i;
                }
            }

            // Print the results
            System.out.println("Index of the highest sum with one number removed: " + maxIndex);
            System.out.println("Index of the lowest sum with one number removed: " + minIndex);
        }
    }

