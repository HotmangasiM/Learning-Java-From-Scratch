// // package WEEK 2.Day 3.Code;

// abstract class Animal{
//     // Abstract method tidak memiliki body
//     public abstract void animalSound();
//     // Regular method
//     public void sleep(){
//         System.out.println("zzz zzz");
//     }

// }
// // subclass inherit the parent class
// class Pig extends Animal{
//     //overring method abstract from parent class
//     public void animalSound(){
//         System.out.println("The pigs says: Wee Wee");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Pig pig = new Pig();
//         pig.animalSound();
//     }
// }


// INTERFACE CASE
// interface Animal{
//     public void animalSound();
//     void sleep();
// }

// interface Breed{
//     public void breed();
// }

// class Pig implements Animal, Breed{
//     public void animalSound(){
//         System.out.println("The pig says: Wee Wee!!");
//     }

//     public void sleep(){
//         System.out.println("ZZZ");
//     }

//     public void breed(){
//         System.out.println("This pig is form Japan");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Pig pig = new Pig();
//         pig.animalSound();
//         pig.sleep();
//         pig.breed();
//     }
// }


// Anonymous Class
// interface Greetings{
//     void sayHello();
// }

// public class Main{
//     public static void main(String[] args) {
//         Greetings greetings = new Greetings() {
//             public void sayHello(){
//                 System.out.println("Hello, World");
//             }
//         };
//         greetings.sayHello();
//     }   
// }

// JAVA ENUMERATION SAMPLE
// public class Main{
//     enum Level{
//         LOW,
//         MEDIUM,
//         HIGH
//     }

//     public static void main(String[] args) {
//         Level level = Level.MEDIUM;
//         System.out.println(level);
//     }
// }

//ENUMERATION MENGGUNAKAN SWITCH
// enum Level{
//     LOW,
//     MEDIUM,
//     HIGH
// }

// public class Main{
//     public static void main(String[] args) {
//         Level level = Level.MEDIUM;

//         switch (level) {
//             case LOW:
//                 System.out.println("LOW level");
//                 break;
//             case MEDIUM:
//                 System.out.println("MEDIUM level");
//                 break;
//             case HIGH:
//                 System.out.println("HIGH level");
//                 break;
//         }
//     }
// }

enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class Main{
    public static void main(String[] args) {
        for(Level level: Level.values()){
            System.out.println(level);
        }   
    }
}

