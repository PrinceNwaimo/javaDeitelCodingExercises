package Chapter17.functionalInteface;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        System.out.println(predicate.test(11));

        Predicate<Integer> andOperation = predicate.and(after);
        System.out.println(andOperation.test(10));

    }
    static Predicate<Integer> predicate = input -> input % 2 ==0;

    static Predicate<Integer> after = afterInput -> afterInput >=5;
}
