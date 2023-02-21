package Chapter4;

import java.util.Scanner;

public class Iam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        counter = ++counter +counter++;
        System.out.println(counter);
    }
}
