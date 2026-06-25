// package WEEK 2.Day 4.Code;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter name, age and salary: ");

        // String input
        String name = obj.nextLine();

        // NUmerical input
        int age = obj.nextInt();
        double salary = obj.nextDouble();

        // Display output by user
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

    }
}
