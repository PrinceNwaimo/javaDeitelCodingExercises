package Chapter7;

public class Calculator {
    public static void main(String[] args) {
        int number = 10;
        square(number);
        System.out.println("number after squaring:: "+number);

    }
//The below is a function.
    public static void square (int firstNUmber){
    firstNUmber = firstNUmber*firstNUmber;
        System.out.println("Square of first number:: "+firstNUmber);

    }


    }

