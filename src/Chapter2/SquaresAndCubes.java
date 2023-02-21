package Chapter2;

public class SquaresAndCubes {
    public static void main(String[] args) {
        int number = 0;
        int square = 0;
        int cube = 0;
        System.out.println("Table: "+"Number"+" "+"Square"+" "+"Cube");
        for (number = 0; number <= 11; number++) {
            for (square = 0; square <= 100; square++) {
                for (cube = 0; cube <= 1000; cube++) {
                    if (square == number * number && cube == square * number) {
                        System.out.println("Answer: "+number+"  "+square+"  "+cube);

                    }

                }
            }

        }
    }
}






