JAVA LIST INTERFACE

- List memperhatikan urutan

beberapa method yang dapat digunakan:
add() : menambahkan elemen di bagian paling akhir
get() : mengembalikan elemen pada posisi tertentu
set() : mengganti elemen berdasarkan posisi tertentu
remove() : menghapus elemen dari sebuah posisi tertentu
size() : mengembalikan ukuran elemen pada list

Array():
1. ukuran tetap
2. lebih cepat untuk data mentah
3. tidak merupakan bagian dari collection framework

List():
1. ukuran yang dinamis
2. lebih flexible dan kaya fitur
3. merupakan bagian dari collection framework


ArrayList
- array yang ukurannya dapat dirubah
ArrayList<String> cars = new ArrayList<>();

ArrayList akan mempertahankan apa yang kita insert atau masukkan

VAR keyword dapat juga digunakan untuk mendeklarasikan sebuah ArrayList tanpa menuliskan dua kali misalnya

-- Sebelum menggunakan var
ArrayList<String> cars = new ArrayList<String>();
-- Menggunakan var
var cars = new ArrayList<String>();

kita juga dapat melihat tipe kode dengan versi seperi berikut:
List<String> cars = new ArrayList<>();

Tipe variablenya merupakan List dan Object aslinya merupakan ArrayList

JAVA LinkedList
Setiap data yang disimpan dalam sebuah Node yang sering disebut sebagai container pada dokumentasi sederhana

Perbedaan antara ArrayList dan LinkedList
ArrayList lebih cepat dalam mengambil data, baca data dan mengakses berdasaarkan indeks
sedangkan untuk LinkedList lebih cepat dalam menambahkan, menghapus, dan sisipkan data karena 

Kapan Menggunakan
ArrayList digunakan untuk menyimpan dan mengakses data sedangkan LinkedList digunakan untuk memanipulasi data

Method yang digunakan
addFirst() : menambahkan elemen pertama pada list
addLast() : menambahkan elemen pada akhir list
removeFirst() : menghapus elemen pada elemn pertama list
removeLast() : menghapus elemen pada elemen terakhir list
getFirst() : mendapatkan elemen pertama list
getLast() : mendapatkan elemen terakhir list

LinkedList<String> cars = new LinkedList<String>();
bisa juga menggunakan keyword var

-- Dapat juga menggunakan List untuk tipe data dan object yaitu LinkedList()

JAVA SORTING LIST
Kita dapat melakukan sorting menggunakan method sort dengan mengimport class Collections dengan sintaks
Collections.sort(object)

JAVA SET
Set merupakan bagian dari Java Collections Framework yang digunakan untuk menyimpan data unik (tidak duplikat) dan tidak mempertahankan urutan elemen

- HashSet => cepat tetapi tidak berurut
- TreeSet => berurutan
- LinkedHashSet => berurutan berdasarkan penambahan

- method yang digunakan adalah sebagai berikut:
1. add() : untuk menambahkan elemen jika belum ada di dalam set
2. remove() : menghapus elemen
3. contains() : mengecek apakah set mengandung elemen tertentu
4. size() : untuk mencek ukuran set
5. clear() : untuk menghapus semua elemen

Perbedaan antara List dan juga Set
1. List
- dapat duplikat
- memperhatikan urutan
- dapat diakses menggunakan indeks

2. Set
- tidak dapat duplikat
- tidak menjamin urutan
- tidak melalui indeks untuk mengakses



