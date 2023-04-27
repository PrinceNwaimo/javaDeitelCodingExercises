package chapter16;

import java.util.Map;
import java.util.TreeMap;

public class MapSample3 {
    public static void main(String[] args) {
        Map<String,Integer> people = new TreeMap<>();//Tree sorts using the Key
        people.put("Zainab",109);
        people.put("Damian",85);
        people.put("BalaBlue",149);
        System.out.println(people);
        System.out.println(people.hashCode());

    }
}
