package Chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects" +
                "\\deitelCodingExercises\\src\\Chapter15\\Hello")) {
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));

            for (byte b : bytes) {
                System.out.println(Character.toString(b) + "");

            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}