package Chapter3;
import java.util.Scanner;

public class WorkInSwitchCase {
    public static void main(String[] args) {




        System.out.println ("1. 2000, 2. 5000, 3. 10000, 4.15000, 5.20000");

        System.out.println("Enter an amount to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("pick a number: ");
        int input = scanner.nextInt();
        switch (input) {

            case 1:
                System.out.println("Withdraw 2000");
            case 2:
                System.out.println("withdraw 5000");
            case 3:
                System.out.println("withdraw 10000");
            case 4:
                System.out.println("withdraw 15000");
            case 5:
                System.out.println("withdraw 20000");
            default:
                System.out.println("Money is finished");

        }
    }

}

