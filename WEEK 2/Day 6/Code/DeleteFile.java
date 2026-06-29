// package WEEK 2.Day 6.Code;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        // object untuk file
        File myFile = new File("filename.txt");
        // pembuatan object folder
        File myObj = new File("C:\\Users\\Myname");
        if(myFile.delete()){
            System.out.println("Deleted the file: "+ myFile.getName());
        }else {
            System.out.println("Failed to delete the file");
        }

    }
}
