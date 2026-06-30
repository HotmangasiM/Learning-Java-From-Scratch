JAVA IO STREAM
merupakan JAVA input dan output 
- stream merupakan aliran data (flow of data)
- File class tidak membaca file, hanya berisi identitas dari sebuah file tersebutr (lokasi, nama, path dan atribut yang lain), akan tetapi yang membaca itu bisa Scanner, Buffered Reader, File input stream
- Terdapat 2 jenis Stream
1. Byte stream yang bekerja dengan byte dipakai untuk gambar, PDF, Video, Audio, ZIP
2. Character Strem yaitu bekerja dengan karakter dipakai untuk txt, csv, json, xml, java, html

Study case: misal user input foto profile kita menggunakan FileInputStream karena binary

kapan menggunakan ...
.txt -> FileReader, BufferedReader
.csv -> BufferedReader
.json -> BufferedReader
.xml -> BuufferedReader
gambar .jpg, .png -> FileInputStream
PDF -> FileInputStream / FileOutputStream
Audio/Video -> FileInputStream / FileOutputStream

BUFFERED READER
buffer : tempat penyimpanan sementara di memori

br.nextLine() -> ambil satu baris

Perbedaan Scanner dan BufferedReader
Scanner = Mudah dipalajari, bisa membaca int, double, String, lebih lambat, cocok untuk input user
BufferedReader = sedikit lebih kompleks, fokus membaca teks, lebih cepat, cocok untuk file besar
FileInputStream = paling cocok untuk binary file (gambar, PDF, audio)

BufferedWriter bertugas untuk menulis file

- Kenapa menggunakan BufferedWriter ketika kita sudah dapat menggunakan FileWriter, yaitu karena BufferedWriter lebih cepat untuk menulis file yang lebih besar
- Buffer merupakan tempat penyimpanan sementara di RAM
- Notes: jika file sudah ada maka yang akan dilakukan yaitu overwrite
- apabila ingin file tidak melakukan overwrite maka bisa menggunakan append dengan keyword true

FileWriter digunakan untuk menulis file sederhana, cepat dan mudah digunakan
BufferedWriter lebih baik digunakan karena lebih cepat dan mudah menambahkan line breaks menggunakan newLine()
FileOutputStream baik digunakan untuk case binary (image, PDF, atau audio)