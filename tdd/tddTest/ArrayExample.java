package tddTest;

import Chapter7.Example4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayExample {
    @Test
    public void testFindOdd(){
        int[] numbers = {11,12,13,14,19,5};
        int []oddElements = Example4.findOdd(numbers);
        int [] expected ={11,13,19,5};
        assertArrayEquals(expected,oddElements);

    }
}
