package Chapter17.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {

        List<String> words = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "DAMIAN",
                "THE LAW"
        );
        String s1 = words.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(s1);

        Map<Integer,List<String>> map = words.stream()
                .collect(Collectors.groupingBy((word)->word.length()));
        System.out.println(map);
    }
}
