// package WEEK 4.Day 3.Code;

// class Box<T>{
//     T value;

//     void set(T value){
//         this.value = value;
//     }

//     T get(){
//         return value;
//     }
// }

class Stats<T extends Number>{
    T[] nums;

    // Constructor
    Stats(T[] nums){
        this.nums = nums;
    }

    // Calculate the average
    double average(){
        double sum = 0;
        for(T num : nums){
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}


public class Runner {
    // public static <T> void printArray(T[] array){
    //     for(T item: array){
    //         System.out.println(item);
    //     }
    // }
    public static void main(String[] args) {
        // Membuat sebuah box yang menampung string
        // Box<String> stringBox = new Box<>();
        // stringBox.set("Hello");
        // System.out.println("Value: "+ stringBox.get());

        // // Membuat box yang menampung Integer
        // Box<Integer> intBox = new Box<>();
        // intBox.set(1);
        // System.out.println("Value: "+ intBox.get());

        // // Mmebuat box yang menampung Character
        // Box<Character> cBox = new Box<>();
        // cBox.set('H');
        // System.out.println("Ambil nilai character yaitu: "+cBox.get());

        // Array of string
        // String[] names = {"Hotmangasi", "Angelina"};

        // // Array of Integer
        // Integer[] numbers = {1, 2, 3};

        // // Call the method of generics with both arrays
        // printArray(names);
        // printArray(numbers);

        Integer[] intNums = {10, 20, 30, 40};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println("Integer Average: "+ intStats.average());

        // Use with Double
        Double[] doubleNums = {1.5, 2.5, 3.5};
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println("Double Average: "+ doubleStats.average());

    }
}
