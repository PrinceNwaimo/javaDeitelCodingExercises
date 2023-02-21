package Chapter3;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Clock prince = new Clock(0,14,43);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = input.nextInt();
        prince.setHour(hour);
        System.out.print("Enter minute: ");
        int minute = input.nextInt();
        prince.setMinute(minute);
        System.out.print("Enter Second: ");
        int second = input.nextInt();
        prince.setSecond(second);
        System.out.printf("The time is: %s\n",prince.displayTime());
    }
}
