package Chapter17.functionalInteface;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        System.out.println("First : " +biPredicate.test("Prince", 6));
        System.out.println("second: " +biPredicate.test("Prof", 10));
    }
    static BiPredicate<String,Integer> biPredicate = (name,lengthOfName)-> name.length() == lengthOfName;

}
