package Chapter15;

import Serialization.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example7 {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\deitelCodingExercises\\Dog"))){
        var dog = (Dog) objectInputStream.readObject();
        System.out.println(dog);
    }catch(IOException | SecurityException | ClassNotFoundException exception){
        exception.printStackTrace();
}
    }
}
