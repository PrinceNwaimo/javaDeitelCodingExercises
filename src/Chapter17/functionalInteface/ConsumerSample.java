package Chapter17.functionalInteface;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumerDeclarative.accept("Zainab");
        consumerImperative("Prince");
//        consumerDeclarative.andThen(after)
    }
    static Consumer<String> consumerDeclarative = name-> System.out.println(name);
    static Consumer<Integer> after = name-> System.out.println(name);

    //Note: Consumer does not return anything.
    //You can do this instead of doing this:
    public static void consumerImperative(String name) {
        System.out.println(name);

    }
}
