package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Java.txt");
            writer.write("Java is a high level, programming language.");
            writer.close();
            System.out.println("File is created.");
        } catch (IOException e) {
            System.out.println("File is not created.");
            e.printStackTrace();
        }
    }
}
