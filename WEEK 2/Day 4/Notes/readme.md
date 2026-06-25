JAVA USER INPUT
- Scanner merupakan sebuah class bawaaan Java yang digunakan untuk membaca input dari berbagai sumber
Langkah Menggunakan Scanner
1. Import scanner
import java.util.Scanner;
2. Membuat object Scanner
Scanner input = new Scanner(System.in);
3. Membaca input
String name = input.nextLine(); => baca satu baris dari keyboard

nextLine(): membaca string value dari user
nextByte(): membaca sebuah byte dari user
nextBoolean(): membaca sebuah boolean dari user
nextFloat(): membaca sebuah float dari user
nextShort(): membaca sebuah short dari user
nextLong(): membaca sebuah long dari user
nextDouble(): membaca sebuah double dari user
nextInt(): membaca sebuah int dari user

JAVA DATE AND TIME
package java.time berisi banyak class

-LocalDate : menyimpan tanggal
-LocalTime : Menyimpan waktu
-LocalDateTime : Menyimpan tanggal + waktu
-DateTimeFormatter : mengatur format tampilan






