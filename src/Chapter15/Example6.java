package Chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\deitelCodingExercises" +
                "\\src\\Chapter15\\Hello")) {
            byte[] bytes = {72, 101, 108,108, 111, 32, 87, 111, 114, 108, 100};
            fileOutputStream.write(bytes);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}