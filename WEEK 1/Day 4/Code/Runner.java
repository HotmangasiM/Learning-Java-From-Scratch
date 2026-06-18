// package WEEK 1.Day 4.Code;

public class Runner {
    public static void main(String[] args){
        // menggunakan for loop
        // for(int i = 1; i<5; i++){
        //     if(i == 2){
        //         continue;
        //     }
        //     if(i == 4){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // menggunakan while loop
        // int i = 0;
        // while(i < 10){
        //     System.out.println(i);
        //     i++;
        //     if(i == 4){
        //         break;
        //     }
        // }
        // while(i < 10){
        //     if(i == 4){
        //         i++;
        //         continue;
        //     }
        //     System.out.println(i);
        //     i++;
        // }

        // Real Life Case
        // int[] numbers = {3, -1, 7, 0, 9};

        // for(int num : numbers){
        //     if(num < 0){
        //         continue;
        //     }
        //     if(num == 0){
        //         break;
        //     }
        //     System.out.println(num);
        // }

        // Java Arrays
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // cars[0] = "Agya";
        // System.out.println(cars[0]);
        // System.out.println("This is length of the array cars: "+ cars.length);

        // String[] cars = new String[4];
        // cars[0] = "Agya";
        // cars[1] ="Honda";
        // cars[2] = "Suzuki";
        // cars[3] = "Yamaha";

        // System.out.println(cars[0]);

        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for( int i = 0; i < cars.length; i++){
        //     System.out.println(cars[i]);
        // }

        // Number
        // int[] numbers = {1, 5, 10, 25};
        // int sum = 0;

        // for(int i = 0; i < numbers.length; i++){
        //     sum += numbers[i];
        // }
        // System.out.println(sum);

        // For Each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // for(String car: cars){
        //     System.out.println(car);
        // }

        for(int i = 0; i < cars.length; i++){
            System.out.println("Seat number "+ i + " is taken by " +cars[i]);
        }
    }
}
