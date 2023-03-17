package Chapter15;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        char[]chars = new char[1024];
        try(FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\deitelCodingExercises\\src\\Chapter15\\Hello")){
            var numberOfCharactersRead = fileReader.read(chars);
            System.out.println(numberOfCharactersRead);
            System.out.println(Arrays.toString(chars));
        }catch(IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
