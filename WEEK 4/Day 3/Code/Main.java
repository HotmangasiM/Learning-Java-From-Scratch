// package WEEK 4.Day 3.Code;

public class Main {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myCharacter = 'A';
        // Membuat Int Object menjadi string
        String newInt = myInt.toString();
        System.out.println("Ini adalah nilai Int yang sudah convert menjadi string: "+ newInt);
        // menggunakan method length() untuk mencek panjang string 
        System.out.println("Panjang dari string adalah: "+ newInt.length());

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myCharacter.charValue());
    }
}
