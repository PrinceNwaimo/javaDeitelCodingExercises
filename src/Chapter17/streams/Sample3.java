package Chapter17.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Sample3 {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        stream1.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.empty();
        stream2.forEach(System.out::println);

        Stream<Integer> stream3 =
                Stream.generate(()-> new Random().nextInt());
               stream3.limit(10)
                .forEach(System.out::println);

               Stream.iterate(1,(number)->number+1)
                       .limit(5)
                       .forEach(System.out::println);


               Stream<Integer>s = Stream.generate(()->1)
                       .limit(10);
        System.out.println(s.reduce(0,(x,y)-> x+y));
    }
}
