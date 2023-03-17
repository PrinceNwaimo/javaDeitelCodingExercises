package Chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class Example9 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\deitelCodingExercises\\src\\Chapter15\\Hello")){
            writer.append("Thank God its Friday");
        }catch(IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
