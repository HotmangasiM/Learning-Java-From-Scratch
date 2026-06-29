
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// package WEEK 2.Day 7.Code;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("image.jpg");
             FileOutputStream output = new FileOutputStream("copy.jpg")) {
                int i;
                while((i = input.read()) != -1){
                    output.write(i);
                }
                System.out.println("File copied successfully");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("error handling file");
        }
    }
}
