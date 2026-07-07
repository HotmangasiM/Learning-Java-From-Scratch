import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(50);
        myNumbers.add(56);
        myNumbers.add(7);

        System.out.println("Ini merupakan tampilan data awal: "+ myNumbers);

        Collections.sort(myNumbers);

        System.out.println("Ini merupakan tampilan data setelah sorting: "+myNumbers);

        Collections.sort(myNumbers, Collections.reverseOrder());

        System.out.println("Ini tampilan array setelah dibalik: "+ myNumbers);
    }
}
