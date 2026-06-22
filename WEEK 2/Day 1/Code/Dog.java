// package WEEK 2.Day 1.Code;

class Animal {
    protected String color = "blue";

    public void sound(){
        System.out.println("bark");
    }
}

class Dog extends Animal {
    private String name = "Doggie";

    public static void main(String[] args){
        Dog newDog = new Dog();

        newDog.sound();

        System.out.println(newDog.color + " " + newDog.name);
    }
}
