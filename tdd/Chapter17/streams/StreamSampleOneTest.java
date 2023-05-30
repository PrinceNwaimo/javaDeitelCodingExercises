package Chapter17.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamSampleOneTest {
    @Test

    void testThatMapReturnsElementOfListMultiplyingEachElementByTwo(){
        List<Integer>numbers = List.of(2,3,4,5);

        var actual = StreamSampleOne.mapMethod(numbers);
        var expected = List.of(4,6,8,10);
        assertEquals(actual,expected);
    }

}