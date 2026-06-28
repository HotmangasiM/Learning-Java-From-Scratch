// package WEEK 2.Day 6.Code;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        try {
            // create object file
            File myObj = new File("filename.txt");
            // Dapat juga membuat file di path tertentu dengan sample sebagai berikut
            // FIle myobj2 = new File("C:\\Users\\MyName\\filename.txt");
            // membuat file
            if(myObj.createNewFile()){
                System.out.println("File created: "+ myObj.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            // menampilkan detail error apabila error terjadi
            e.printStackTrace();
        }
    }
}
