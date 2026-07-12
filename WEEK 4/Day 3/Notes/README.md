WRAPPER CLASS
- menyediakan cara agar tipe data primitive dapat menjadi sebuah object

byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
boolean -> Boolean
char -> Char

JAVA GENERICS
- membuat kita dapat menulis class, dan method yang bekerja dengan berbagai tipe data, tanpa menjelaskan secara spesifik tipe data yang ingin kita gunakan 

KENAPA MENGGUNAKAN GENERICS
1. Code Reusability : menulis sekali class atau method yang bekerja dengan berbagai tipe data
2. Type Safety: sudah menangkap error mulai dari proses compile bukans dari runtime
3. Cleaner Code : tidak perlu di ubah(casting) lagi ketika menerima object

case:
class Box<T> {
  T value; // T is a placeholder for any data type

  void set(T value) {
    this.value = value;
  }

  T get() {
    return value;
  }
}

Penjelasan:
T merupakan tipe parameter generic. seperti placeholder untuk sebuah tipe data
ketika membuat Box<String> maka T berubah menjadi String
ketika membuat Box<Integer> maka T berubah menjadi Integer

menggunakan cara ini class yang sama dapat digunakan tanpa menulis kembali code 

Menggunakan kasus yang ada di file Runner.java
- method printArray() mengambil array berdasarkan type T yang dilempar
- ketika memanggil method, java menentukan apa T yang seharusnya berdasarkan argumen yang diberikan

Bounded Types : Tipe terbatas
Kita dapat menggunakan extends untuk membatasi tipe generic class atau method yang dapat kita terima

misalnya kita hanya ingin untuk valuenya dalah Number: Integer dan juga Double misalnya

JAVA ANNOTATIONS
merupakan konsep yang dipakai di Java untuk memberikan metadata (informasi tambahan) pada kode 

Annotations merupakan label atau catatan yang ditempelkan pada kode JAVA dan ditandai dengan simbol @

misalnya :
@Override => mengindikasikan bahwa method tersebut di override dari parent class
@Deprecated => menandai kalau method atau class tersebut sudah outdated atau tidak digunakan
@SuppressWarnings => menjelaskan kepada compiler untuk mengabaikan warnings

Annotation biasanya dibaca oleh compiler

JAVA REGEX
Regular Expression adalah sekumpulan karakter yang membentuk pola pencarian (search pattern)

dapat digunakan menggunakan import package:
import java.util.regex;
dan memiliki 3 class utama
1. Pattern : cetakan pola
2. Matcher : Mencocokkan pattern dengan sebuah string
3. PatternSyntaxException

JAVA THREADS
Thread merupakan jalur eksekusi didalam sebuah program

Thread pada Java
1. extends Thread
2. implements Runnable

Tidak ada cara untuk mengetahui urutan kode yang akan dijalankan apbila menggunakan thread, saat thread dan program utama membaca dan manulis variable yang sama, nilainya jadi tidak bisa diprediksi
ini yang dinamakan Concurency

Untuk mencegah concurency maka dapat menggunakan method isAlive()

LAMBDA EXPRESSION
- merupakan fitur java 8
- cara singkat membuat implementasi Functional Interface
- Tidak memiliki nama seperti method biasa
- Banyak digunakan pada collection dan Stream API

Syntax:
(paramater) -> expression
atau
(paramater) -> {
    statement;
    return value;
}
 tapi dengan syarat: Interface harus functional Interface (Hanya satu abstract method)\

 





