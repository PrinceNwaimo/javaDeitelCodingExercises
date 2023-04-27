package chapter16;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MapSample6 {
    public static void main(String[] args) {
        List<Integer> love = new LinkedList<>();
        love.add(50);
        love.add(30);
        love.add(20);
        love.add(100);

        Collections.sort(love);
        Collections.reverse(love);
        System.out.println(Collections.max(love));
        System.out.println(Collections.min(love));
        System.out.println("after sorting"+love);
    }
}
