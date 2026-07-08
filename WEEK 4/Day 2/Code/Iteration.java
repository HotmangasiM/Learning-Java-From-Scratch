import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Yamaha");
        cars.add("Volvo");
        cars.add("Mazda");

        // Get the Iterator
        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            String i = it.next();

            if(i == "Volvo"){
                it.remove();
            }
        }


        // System.out.println("Ini merupakan value dari it: "+ it);

        // Print the first item
        System.out.println(it.next());
    }
}
