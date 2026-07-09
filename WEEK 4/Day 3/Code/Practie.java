// package WEEK 4.Day 3.Code;

class Animal{
    void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    // Annotations
    @Override
    void makeSound(){
        System.out.println("Woof!");
    }
}

public class Practie{

    @Deprecated
    static void oldMethod(){
        System.out.println("This method is outdated...");
    }

    @SuppressWarnings("unchecked")


    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        oldMethod();
    }
}






