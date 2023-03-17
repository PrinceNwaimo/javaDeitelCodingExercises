package chapter16;

import java.util.LinkedList;
import java.util.List;

public class CollectionSample2 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Fola");
        names.add("Malik");
        System.out.println(names);

        boolean Bay = names.contains("Cash");
        System.out.println(Bay);

        List<String> list = List.of("Malik");
        boolean Bay1 = names.containsAll(list);
        System.out.println(Bay1);

        System.out.println(names.get(1));
    }
}
