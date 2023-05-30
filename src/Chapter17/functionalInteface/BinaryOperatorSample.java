package Chapter17.functionalInteface;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("Prof", "Zainab"));
    }
    static BinaryOperator<String> binaryOperator =
            (firstName, lastName)-> firstName + " "+lastName;
}
