package Chapter3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. GoalKeeper" +
                "2. Defender" +
                "3. Defender" +
                "4. Defensive midfielder" +
                "5. Defender" +
                "6. Defender" +
                "7. Right winger" +
                "8. MidFielder" +
                "9. Striker" +
                "10. Central Midfielder" +
                "11. left Winger");
        System.out.println("pick a number: ");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Goalkeeper");
            case 2:
                System.out.println("Defender");
                break;
            case 3:
                System.out.println("Defender");
                break;
            case 4:
                System.out.println("Midfielder");
                break;
            case 5:
                System.out.println("Defender");
                break;
            case 6:
                System.out.println("Defender");
            default:
                System.out.println("You are not a baller");



        }
    }
}
