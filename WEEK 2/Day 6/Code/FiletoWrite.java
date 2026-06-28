// package WEEK 2.Day 6.Code;
import java.io.FileWriter;
import java.io.IOException;

public class FiletoWrite {
    public static void main(String[] args) {
        try {
            FileWriter myObj = new FileWriter("filename.txt");
            myObj.write("Ini adalah test untuk menulis file yang sudah dibuat");
            myObj.close();
            System.out.println("Berhasil menulis file");
            System.out.println("Mencoba membaca isi file");
            // System.out.println("Ini adalah hasil file: "+ myObj.getName());
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
