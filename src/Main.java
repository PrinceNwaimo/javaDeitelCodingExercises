import Serialization.Dog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try(    var fileOutputStream = new FileOutputStream("Dog");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            Dog aja =new Dog("Lucky",35);
            objectOutputStream.writeObject(aja);
        }catch (IOException | SecurityException exception){
            exception.printStackTrace();
    }
    }
}