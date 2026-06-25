// package WEEK 2.Day 4.Code;
// import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.*;
// import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // LocalDate myObj = LocalDate.now();
        // LocalTime myObjTime = LocalTime.now();
        // LocalDateTime mLocalDateTime = LocalDateTime.now();
        // System.out.println(myObj);
        // System.out.println("This is the local time: "+ myObjTime);
        // System.out.println("This is the Local Date Time: "+ mLocalDateTime);
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting: "+ myDateObj);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatter);
        System.out.println("After Formatted: "+ formattedDate);

    }
}
