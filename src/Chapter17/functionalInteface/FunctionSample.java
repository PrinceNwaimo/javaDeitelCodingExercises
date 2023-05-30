package Chapter17.functionalInteface;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        System.out.println(function.apply("Prince"));
        System.out.println(function1.apply(20));
        System.out.println(multipleByTwenty(20));
        Function <Integer,Integer> result =
                functionOne.andThen(functionTwo);
                functionOne.compose(functionTwo );
        System.out.println(result.apply(10));

    }
    static Function<String,Integer> function = name -> name.length();
    static Function<Integer,Integer> function1 = input -> input * 20;//same as

    public static int multipleByTwenty(int input){
        return input * 20;
    }
    static Function<Integer, Integer>work = input -> input * 2;

    static Function<Integer,Integer>work2 = input -> input + 5;

    static Function<Integer, String> functionOne =
            input -> input * 20 +"";
    static Function <String,Integer> functionTwo =
            name -> name.length();
}
