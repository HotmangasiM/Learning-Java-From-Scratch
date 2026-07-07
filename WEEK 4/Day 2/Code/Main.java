
import java.util.ArrayList;

// package WEEK 4.Day 2.Code;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");

        cars.add(1, "Mazda");

        System.out.println("Ini merupakan elemen pertama: "+cars.get(0));

        cars.set(0, "Yamaha");

        System.out.println("Ini merupakan perubahan dari set: "+ cars);

        cars.remove(0);

        System.out.println("Ini adalah array setelah dihapus: "+ cars);

        // ini merupakan untuk menghapus semua array
        // cars.clear();

        // Ini merupakan ukuran dari arraylist string
        System.out.println("Ini merupakan ukuran: "+cars.size());

        // System.out.println(cars);
        // loop menggunakan for
        // for(int i = 0; i < cars.size(); i++){
        //     System.out.println(cars.get(i));
        // }

        // Loop menggunakan for each
        for(String i : cars){
            System.out.println(i);
        }
    }
}
