package Chapter17.streams;

import java.util.List;

public class StreamTwo {
    public static void main(String[] args) {
        List<Integer>nums = List.of(1,2,3,4);
        System.out.println(nums
                .stream()
                .map(x -> x+5)
                .map(x -> x -2)
                .toList());
    }
}
