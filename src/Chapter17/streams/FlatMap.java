package Chapter17.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> list = List.of(
                "AAA","BBB","CCC","DDD","QWERTY"
        );
        list.stream()
                .flatMap(s-> Stream.of(s.split("")))
                .forEach(System.out::println);

        List<String> list1 = list.stream()
                .flatMap(s -> Stream.of(s.split("")))
                .toList();
        System.out.println(list1);
    }

}
