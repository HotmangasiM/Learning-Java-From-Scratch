// package WEEK 1.Day 5.Code;

public class Main {
       // final int x = 5;
       // int age = 6;
       // String fName = "Hotmangasi";
       // String lName = "Manurung";
       // int x;
       // static void myMethod(){
       //        System.out.println("Hello World");
       // }
       int x;

       // Constuctor
       public Main(int y){
              x = y;
       }

       public static void main(String[] args){
              // Main myObj1 = new Main();
              // myObj1.x = 40;
              // System.out.println(myObj1.x);
              // System.out.println("My name is: "+ myObj1.fName + " "+ myObj1.lName);
              // System.out.println("My age is: "+ myObj1.age);
              // myMethod();

              Main myObj = new Main(5);
              System.out.println(myObj.x);


       }
}
