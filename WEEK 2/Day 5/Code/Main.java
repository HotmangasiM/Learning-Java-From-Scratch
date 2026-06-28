// package WEEK 2.Day 5.Code;

public class Main {
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access Denied");
        }

        System.out.println("Access granted");
    }
    
    public static void main(String[] args) {
        checkAge(15);
    }
}
