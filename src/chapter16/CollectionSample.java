package chapter16;

import java.util.*;

public class CollectionSample {
    // Ways of creating a list collection
    public static void main(String[] args) {
        //using method addAll()which helps you to add all the elements in another collection into yours.

        Queue<Integer>larger = new LinkedList<>();
        larger.add(1);
        larger.add(2);
        larger.add(3);

        List<Integer> nums = new ArrayList<>();//Way of creating  a list in java or you can do this as well
        nums.add(10);
        nums.add(40);
        nums.add(50);
        nums.add(2,100);
        nums.addAll(larger);

        System.out.println(nums);


        List<Integer> numbers = Arrays.asList(1,2,3,4,5);//or
        List<String> names = List.of("James","Bond","BirdMan");
        // you can add element to the list by using the add method(which is an overloaded one).
    }
}
