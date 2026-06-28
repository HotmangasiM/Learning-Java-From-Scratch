JAVA ERROR
- Error merupakan kondisi ketika program tidak berjalan sesuai dengan yang diharapkan

Terdapat 3 jenis error pada java
- Compile Time error : merpakan error yang paling mudah dan bahkan sebelum program berjalan
misalnya tidak memiliki penutup titik koma pada program
- Run time error: Program berhasil di compile tetapi saat dijalankan program crash
misalnya pembagian dengan bilangan 0
ArithmeticException = pembagian dengan 0
ArrayIndexOutOfBoundsException = index array salah
NullPointerException = object bernilai null
NumberFormatException = string bukan angka
InputMismatchException = Scanner membaca tipe yang salah
- Logical error: program berhasil di compile, berjalan tetapi hasilnya salah
misalnya output yang ingin dihasilkan adalah 5+5= 10 tetapi hasilnya jadi 0

JAVA DEBUGGING
Debugging merupakan proses mencari penyebab suatu bug atau kesalahan dan memperbaikinya (root cause)
Bug merupakan perilaku program yang tidak sesuai dengan harapan

cara melakukan debugging yang benar yaitu dengan step berikut:
1. cek apakah input sudah benar
2. cek apakah variable sudah benar
3. cek apakah perhitungan sudah benar
4. cek apakah output sudah benar

Exception : bukan untuk menghilangkan error tetapi menngontrol apa yang harus dilakukan apabila error terjadi

exception adalah objek yang merepresentasikan suatu kesalahan (error) yang terjadi saat program berjalan

terdapat beberapa keyword yang digunakan :
try{ // lakukan ini

} catch(Exception e){ // apbila tidak berjalan maka tampilkan error 

} finally{ // kode ini akan selalu dijalankan

}

throw ada untuk membuat exception, sedangkan untuk try-catch ada untuk menangkap exception
kapan menggunakan throw 

Throwable
│
├── Error
│     (Jarang ditangani programmer)
│
└── Exception
      │
      ├── RuntimeException
      │     ├── NullPointerException
      │     ├── ArithmeticException
      │     ├── NumberFormatException
      │     └── ArrayIndexOutOfBoundsException
      │
      └── Checked Exception
            ├── IOException
            ├── FileNotFoundException
            └── ClassNotFoundException



Multiple Catch for exception
try dapat memiliki banyak catch 

Urutan catch yang paling penting yaitu yang paling spesifik berada di paling atas




