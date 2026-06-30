
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try (FileInputStream input = new FileInputStream("filename.txt")) {
        //     int i;

        //     while((i = input.read()) != -1){
        //         System.out.println((char) i);
        //     }
        // } catch (IOException e) {
        //     // TODO: handle exception
        //     System.out.println("Error reading file");
        // }

        try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
            String line;
            // kenapa menggunakan while karena kita tidak mengetahui file ada berapa baris
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error when reading file");
        }
    }
}
