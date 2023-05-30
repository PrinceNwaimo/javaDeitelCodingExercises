package Chapter17.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List <String> names = List.of(
                "Pauline",
                "Prof",
                "Joshua",
                "Zainab",
                "Deborah",
                "AllWellThatIsLookingForTrouble"
        );
        System.out.println(names
                .stream()
                .map(String::toUpperCase)
                .filter(x -> x.length() < 9)
                .toList()
                .stream().toList());

        System.out.println(names
                .stream()
                .collect(Collectors.toMap(String::toString, String :: length)));


    }
}
