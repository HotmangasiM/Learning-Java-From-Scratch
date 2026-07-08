
import java.util.ArrayList;
import java.util.Collections;

public class RunnerAgain {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Hotmangasi");
        names.add("Kasper");
        names.add("Sunil");

        System.out.println("Ini merupakan tampilan list tanpa sorting: "+names);
        // System.out.println("Hotmangasi before sorting is index: "+index);

        Collections.sort(names);
        System.out.println("Ini merupakan tampilan list setelah sorting: "+ names);

        // ini adalah tampilan list setelah di reverse order
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Ini merupakan tampilan list setelah di reverse order: "+ names);

        int index = Collections.binarySearch(names, "Hotmangasi");
        System.out.println("Hotmangasi is index: "+index);

        Collections.swap(names, 0, 2);
        System.out.println("Ini adalah tampilan list setelah ditukar: "+ names);
    }
}
