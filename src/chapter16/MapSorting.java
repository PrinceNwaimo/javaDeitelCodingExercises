package chapter16;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSorting {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Joshua",50);
        students.put("Joseph",35);
        students.put("Philip",40);
        students.put("Law",19);

        Map<String,Integer>sorted = students.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));

        System.out.println(sorted);

    }
}
