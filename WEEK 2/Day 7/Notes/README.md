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