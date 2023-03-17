package Chapter15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            bufferedReader.readLine();
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\deitelCodingExercises\\src\\Chapter15\\Hello");
            String input = bufferedReader.readLine();//reading from the console
            writer.write(input);

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}