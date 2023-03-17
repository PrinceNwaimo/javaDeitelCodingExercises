package Chapter15;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {
        Path path = Paths.get("a","b","c");
        System.out.println(File.separator);//helps you know your Operating system separator.
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getFileSystem());
        System.out.println(path.normalize());
        System.out.println(path.getParent());


    }

}
