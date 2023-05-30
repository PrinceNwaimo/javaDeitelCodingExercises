package dsaTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void testThatDigitsCount(){
        String[] arr = {"AB1396","Q2RBS", "G381AC"};
        assertEquals(8,Task1.kuli(arr));


    }

}