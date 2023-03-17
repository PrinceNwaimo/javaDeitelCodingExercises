package chapter16;

import java.util.HashSet;
import java.util.Set;

public class CollectionSample3 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Tinuade(AKA Birthday geh)");
        names.add("Felix(Father figure)");
        names.add("Josh(Family Man)");
        names.add("James(AKA King James)");
        names.add("Balablu(AKA president-select)");

        System.out.println(names);

        System.out.println();

        System.out.println(names.toArray()[names.toArray().length - 3]);
    }
}
