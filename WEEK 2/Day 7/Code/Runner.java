
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))) {
            bw.write("First Line");
            bw.newLine(); // add line break
            bw.write("Second line");
            bw.newLine();
            bw.write("Third line");
            bw.write("Fourth Line");
            bw.newLine();
            bw.write("Hotmangasi");
            System.out.println("Successfully write a file");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error writing file");
        }
    }
}
