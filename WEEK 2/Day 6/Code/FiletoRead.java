// package WEEK 2.Day 6.Code;
import java.io.File;
public class FiletoRead {
    public static void main(String[] args) {
        // membuat object file
        File myFile = new File("filename.txt");
        //membaca file dari inputan object
        // try (Scanner myReader = new Scanner(myFile)){
        //     while(myReader.hasNextLine()){
        //         String data = myReader.nextLine();
        //         System.out.println(data);
        //     }
        // } catch (FileNotFoundException e) {
        //     // TODO: handle exception
        //     System.out.println("An error occured");
        //     e.printStackTrace();
        // }

        if(myFile.exists()){
            System.out.println("File name: "+myFile.getName());
            System.out.println("Absolute Path: "+ myFile.getAbsolutePath());
            System.out.println("Writeable: "+ myFile.canWrite());
            System.out.println("Readable: "+ myFile.canRead());
            System.out.println("File ini byte size:"+ myFile.length());
        } else {
            System.out.println("File is not exist");
        }
    }
}
