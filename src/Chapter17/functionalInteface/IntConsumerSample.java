package Chapter17.functionalInteface;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::print;
        intConsumer.accept(100000);
    }
}
