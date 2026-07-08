// import java.util.HashMap;
import java.util.LinkedHashMap;

public class Practice {
    public static void main(String[] args) {
        // membuat objeck HashMap dengan nama capitalCities
        // HashMap<String, String> capitalCities = new HashMap<>();
        // TreeMap<String, String> capitalCities = new TreeMap<>();
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        // menambahkan key dan juga values
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("England", "London");
        capitalCities.put("Indonesia", "Jakarta");
        

        System.out.println(capitalCities);

        // Akses sebuah Ite,
        // capitalCities.get("England");
        // System.out.println("Ini merupakan England: "+ capitalCities.get("England"));

        // capitalCities.remove("England");
        // System.out.println("Ini merupakan list setelah england di hapus: "+ capitalCities);
        // System.out.println("Ini merupakan ukuran dari Map: "+ capitalCities.size());

        // System.out.println(capitalCities);
        // perulangan untuk menampilkan Key
        // for(String i : capitalCities.keySet()){
        //     System.out.println(i);
        // }

        // Perulangan untuk menampilkan Values
        // for(String i : capitalCities.values()){
        //     System.out.println(i);
        // }

        // Untuk menampikan keduanya
        // for(String i : capitalCities.keySet()){
        //     System.out.println("Key: "+ i + " value: "+ capitalCities.get(i));
        // }
    }
}
