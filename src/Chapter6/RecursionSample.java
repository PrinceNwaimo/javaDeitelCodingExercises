package Chapter6;

public class RecursionSample {
    public static void main(String[] args) {
        printRightFacingTriangle(7);
        printLeftFacingTriangle(6);
    }
    private static void printRightFacingTriangle(int number){
        if(number<1)return;
        number = number-1;
        printRightFacingTriangle(number);
        for (int index = 0; index < number; index++) {
            System.out.print("* ");

        }
        System.out.println();
    }

    private static void printLeftFacingTriangle(int number){
        if (number<1){
            return;
        }
        number=number-1;
        printLeftFacingTriangle(number);
        for (int index = number; index < 10 ; index++) {
            System.out.print(" ");
        }
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
