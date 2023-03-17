package chapter16;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample4 {//Use of the treeSet
    public static void main(String[] args) {
        System.out.println(Character.getNumericValue('C'));
        System.out.println(Arrays.toString("A".getBytes()));
        Set<Integer> nums = new TreeSet<>();
        nums.add(30);
        nums.add(10);
        nums.add(16);
        nums.add(1);
        System.out.println(nums);
        go();
    }

    private static void go() {
        Set<String> names = new TreeSet<>();
        names.add("Tinuade");
        names.add("Timothy");
        names.add("Tinuke");
        names.add("Tammy");
        names.add("tayo");//this will come last because of the unicode character because T comes first before t
        System.out.println(names);

    }
}