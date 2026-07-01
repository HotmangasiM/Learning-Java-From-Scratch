// package WEEK 3.Projects;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        // menampilkan menu minimal sekali
        do{
            System.out.println("STUDENT GRADE APP");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Show average score");
            System.out.println("4. Exit");
            // mendapatkan inputan dari user
            menu = scanner.nextInt();
            // membersihkan inputan user apabila mengandung enter
            scanner.nextLine();
            // melakukan pengecekan terhadap inputan user dan mengarahkan sesuai dengan method yang sesuai
            switch (menu) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    showAverageScore();
                    break;
                case 4:
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Invalid menu");;
            }
            System.out.println();
        } while (menu != 4);
            scanner.close();
    }

    static void addStudent(){

        // misal user memilih 1, maka sistem akan meminta inputan yang diperlukan
        System.out.println("Student ID: ");
        String id = scanner.nextLine();

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Score: ");
        int score = scanner.nextInt();
        scanner.nextLine();
        // Membuat objek yang memanggil constructor Student
        Student student = new Student(id, name, score);
        // objek dimasukan ke dalam array list
        students.add(student);

        System.out.println("Student added successfully.");

    }

    static void showStudents(){
        if(students.isEmpty()){
            System.out.println("No student data");
            return;
        }

        for(Student student : students){
            student.showInfo();
        }
    }

    static void showAverageScore(){
        if(students.isEmpty()){
            System.out.println("No student data..");
            return;
        }

        int total = 0;

        for(Student student: students){
            total += student.getScore();
        }

        double avg = (double) total / students.size();

        System.out.println("Average Score : "+ avg);
    }
}
