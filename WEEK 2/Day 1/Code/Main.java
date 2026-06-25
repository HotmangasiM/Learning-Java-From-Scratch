class Animal{
    public void animalSound(){
        // System.out.println("Animal make a sound");
    }

    public void colorSkin(){};
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog say: bow bow");
    };

    public void breed(){
        System.out.println("This dog breed is pitbull");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig say: Wee Wee");
    };
}

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog();
        Pig pig = new Pig();

        // animal.animalSound();
        dog.animalSound();
        dog.breed();
        // pig.animalSound();
    }
}
