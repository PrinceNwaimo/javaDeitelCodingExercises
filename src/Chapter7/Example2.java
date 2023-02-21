package Chapter7;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("How many scores do you want to add?");
        int numberOfScores = scanner.nextInt();
        int[] scores = new int[numberOfScores];
        int sum = 0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter score "+(index+1));
            scores[index] = scanner.nextInt();
        }
        for (int index = 0; index < scores.length; index++) {
            sum+=scores[index];
        }
        System.out.println("Sum of scores is "+sum);
    }
}
