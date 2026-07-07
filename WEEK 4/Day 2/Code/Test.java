
import java.util.LinkedHashSet;
// import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // HashSet<String> cars = new HashSet<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("BMW");
        // cars.add("Mazda");
        // cars.contains("Mazda");
        // cars.remove("Volvo");
        // // untuk menghapus semua element
        // // cars.clear();
        // // untuk mencek ukuran koleksi
        // // cars.size()

        // // perulangan yang dapat digunakan 
        // // for(int i : cars){
        // //     System.out.println(i);
        // // }
        // System.out.println(cars);

        // HashSet<Integer> numbers = new HashSet<Integer>();
        // numbers.add(4);
        // numbers.add(7);
        // numbers.add(8);

        // for(int i =  0; i <= 10; i++){
        //     if(numbers.contains(i)){
        //         System.out.println(i + " berada di dalams set");
        //     } else {
        //         System.out.println(i + " Tidak berada di dalam set");
        //     }
        // }

        // TreeSet<String> cars = new TreeSet<>();
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);
    }
}
