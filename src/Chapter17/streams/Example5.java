package Chapter17.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
    List<String> words = List.of(
            "AAA",
            "BBB",
            "QWERTY",
            "ASDFG"
    );

    Map<Boolean, List<String>> map = words.stream()
            .collect(Collectors.partitioningBy((w)->w.length()%2 == 0));
        System.out.println("LIST :: "+map);
//
//        Map <Boolean, Set<String>> map1 = words.stream()
//                .collect(Collectors.partitioningBy((w)->w.length()%2==0),Collectors)
    }
}
