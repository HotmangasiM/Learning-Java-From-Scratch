
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("filename.txt")) {
            int i;

            while((i = input.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error reading file");
        }
    }
}
