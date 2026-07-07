DATA STRUCTURE 

- merupakan cara untuk menyimpan dan mengorganisir data agar  mudah dicari, digunakan, ditambah dan dihapus
- ketika misalnya mengguankan String[] cars = new String[3];
artinya java membuat 3 tempat, jadi kalau misalnya ingin menambah data misalnya 4 maka tidak bisa 

maka dari itu solusinya dapat menggunakan ArrayList -> array yang ukurannya bisa bertambah atau berkurang secara otomatis

- kita juga dapat mendefinisikan sebuah tipe array terentu dengan mengguanakan <tipe data>
misalnya ArrayList<String>

- untuk method yang sering digunaknan yaitu .add untuk menambahkan data dan .get(index) untuk mendapatkan nilai data berdasarkan indexing

- Kemudian terdapat juga HashSet yang memiliki aturan tidak dapat duplicate

- HashMap menggunaka konsep key:value dapat melakukan pencarian dari key

- Kemudian Iterator bertugas untuk berjalan satu per satu melewati isi sebuah COllection

JAVA COLLECTION FRAMEWORK 
- DEFINISI : merupakan kumpulan intercase dan class yang digunakan untuk menyimpan serta mengelola sekumpulan data

List: ArrayList, LinkedList             : Koleksi yang mengizinkan duplikat
Set: Hashset, TreSeet, LinkedHashSet    : Koleksi dengan unik elemen (tidak mengizinkan duplikat)
Map: HashMap, TreeMap, LinkedHashMap    : menyimpan pasangan key-dan value

List : 
ArrayList : Array yang bisa diubah ukurannya, mempertahankan urutan, dan memungkinkan duplikat
LinkedList : operasi tambah dan hapus dengan cepat

Set:
HashSet: Koleksi yang tidak berurutan dari elemen unik
TreeSet: terurut alami dengan elemen unik
LinkedHashSet: mempertahankan urutan saat elemen dimasukan

Map:
HashMap : menyimpan pasangan kunci/nilai tanpa urutan tertentu
TreeMap : terurut berdasarkan urutan alami kunci
LinkedHashMap: mempertahanakan urutan saat kunci dimasukan

Gunakan List apabila kita memerlukan urutan, mungkin ada duplikat, dan ingin mengakses kelas berdasarkan indeks
Gunakan Set apabila hanya perlu menyimpan nilai unik
Gunakan HashMap ketika perlu menyimpan pasangan kunci dan nilai seperti nama dan nomor telepon


