package Chapter5;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int blank = 1;
        for (int bottomTriangleRow = 10; bottomTriangleRow > 0; bottomTriangleRow -= 1) {
            for (int space = 0; space < blank; space++) {
                System.out.print("");

            }
            for (int asterisk = bottomTriangleRow; asterisk > 0; asterisk--) {
                System.out.print("*");

            }
            System.out.println();
            blank++;

        }


        System.out.println("Pattern A");
        System.out.println("      ");
        blank = 4;
        for (int topTriangleRow = 1; topTriangleRow < 11; topTriangleRow += 1) {
            for (int space = 0; space < blank; space++) {
                System.out.print("");
            }
            for (int asterisk = 1; asterisk <= topTriangleRow; asterisk++) {
                System.out.print("*");

            }
            System.out.println();
            blank--;


        }
        System.out.println("Pattern B");
        System.out.println("  ");


        blank = 1;
        for (int triangleRow = 10; triangleRow > 0; triangleRow--) {
            for (int space = 0; space < blank; space++) {
                System.out.print(' ');
            }
            for (int asterisk = triangleRow; asterisk > 0; asterisk--) {
                System.out.print("*");

            }

            System.out.println();
            blank++;
        }
        System.out.println("Pattern C");
        System.out.println("  ");

        blank = 9;
        for (int triangleRow = 10; triangleRow > 0; triangleRow--) {
            for (int space = 0; space < blank; space++) {
                System.out.print(' ');
            }
            for (int asterisk = 10; asterisk > triangleRow; asterisk--) {
                System.out.print("*");

            }

            System.out.println();
            blank--;


        }
        System.out.println("Pattern D");
    }
}