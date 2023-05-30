package Chapter17.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSampleOne {
public static List<Integer>mapMethod(List<Integer> numbers){
    return numbers
            .stream()
            .limit(4)
            .map(num-> num * 2)
            .collect(Collectors.toList());
}
}
