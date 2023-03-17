package chapter16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample5 {
    public static void main(String[] args) {//Using the HashSet
        Set<Integer> nums = new HashSet<>();
        nums.add(30);
        nums.add(10);
        nums.add(16);
        nums.add(1);
        System.out.println(nums);
        go();
    }

    private static void go() {
        Set<String> names = new HashSet<>();
        names.add("Tinuade");
        names.add("Timothy");
        names.add("Tinuke");
        names.add("Tammy");

        System.out.println(names);

    }
}
