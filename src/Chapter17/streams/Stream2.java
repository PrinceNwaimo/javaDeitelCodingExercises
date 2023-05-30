package Chapter17.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);

        Optional<Integer> variables = IntStream
                .rangeClosed(0,10)
                .boxed()
                .reduce(Integer::sum);
        System.out.println(variables.get());
        System.out.println(IntStream
                .iterate(0, i -> i < 20, x -> x + 2)
                .boxed()
                .toList()
                .stream().toList());

    }
}