package Chapter15;

import java.io.*;

public class BufferedWriterSample {
    public static void main(String[] args) {
        String words[] = {"Mr Samuel","ASDFG","ZXCVB","POIUY","LKJHG","MNBVC"};
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\deitelCodingExercises\\src\\Chapter15\\Hello"));
        BufferedWriter bufferedWriter=new BufferedWriter(writer)){
            bufferedWriter.write(words[0]+""+words[3]);
//            bufferedWriter.close();
//            bufferedWriter.write("");
        }catch(IOException exception){
            System.err.println(exception.getMessage());
        }
    }
    }