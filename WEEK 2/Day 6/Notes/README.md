JAVA FILES

File handling merupakan salah satu bagian penting dalam sebuah aplikasi
Java sendiri memiliki beberapa method seperti membuat, membaca, mengedit, dan juga menghapus file

File class dari java.io package membuat kita dapat bekerja dengan file
kita dapat membuat objek dan membuat nama file dan juga direktori

- Terdapat beberapa method yang tersedia seperti:
- canRead() -> boolean -> mengecek apakah sebuah file dapat dibaca atau tidak
- canWrite() -> boolean -> mengecek apakah sebuah file dapat ditulis kembali atau tidak
- createNewFile() -> boolean -> membuat file kosong
- delete() -> boolean -> menghapus sebuah file
- exists() -> boolean -> mengecek apakah sebuah file ada atau tidak
- getName() -> boolean -> mengembalikan nama sebuah file
- getAbsolutePath() -> boolean -> mengembalikan absolutepath dari sebuah file
- length() -> boolean -> mengembalikan ukuran dari sebuah file dalam bytes
- list() -> boolean -> mengembalikan sebuah array dari sebuah file dalam direktori
- mkdir() -> boolean -> membuat sebuah direktori

JAVA CREATE FILE
- pada java dapat menggunakan method createNewFile() dan akan mengembalikan nilai true apabila file berhasil dibuat dan false ketika file sudah ada, dan pastikan untuk membungkusnya menggunakan try_catch (exception handling) yang sudah kita pelajari sebelumnya

JAVA WRITE FILE
- menggunakan method write() untuk insert ke file
- menggunakan method close() untuk menutup file(akan tetapi pada java modern tidak perlu melakukannya karena otomatis dilakukan oleh java sendiri)
- Overwrite : method write akan melakuan overwrite yang sudah ada sedangkan untuk append() yaitu menambahkan ke file yang sudah ada 
- ada beberapa cara yang digunakan untuk membuat file yaitu FileWrite untuk basic text
- BufferedWriter untuk text yang besar, dikarenakan lebih cepat dan mempunyai fitur-fitur yang berguna
- FileOutputStream untuk binary data (images, audio, PDF)
