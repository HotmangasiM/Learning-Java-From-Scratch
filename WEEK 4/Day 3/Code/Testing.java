
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {
    public static void main(String[] args) {
        // membuat pattern dengan menggunakan method compile()
        // Parameter pertama menunjukkan pola mana yang sedang dicari dan parameter yang kedua menunjukkan bahwa pencarian tidak sensitif dan parameter kedua bersifat opsional
        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        System.out.println("Ini merupakan pattern: "+ pattern);
        // matcher digunakan untuk mencari sebuah pola dalam string. mengembalikan matcher objek yang mengandung informasi dari pencarian yang dilakukan
        Matcher matcher = pattern.matcher("Saya Belajar Java");
        System.out.println("Ini merupakan matcher: "+ matcher);
        // find() mengembalikan true apabila pola ditemukan pada string dan false apabila tidak menemukan
        System.out.println("Beriikan nilai method find(): "+ matcher.find());
        if(matcher.find()){
            System.out.println("Ketemu");
        } else{
            System.out.println("Tidak ketemu");
        }
    }
}
// ketika saya mencoba find() yang pertama maka akan mencari Java dalam kalimat "Saya Belajar Java"
// sedangkan ketika mencoba find() kembali maka kalimat nya tidak ada lagi karena method find() bukan hanya mengecek
// tetapi juga untuk memindahkan pencarian