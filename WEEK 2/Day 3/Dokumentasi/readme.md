Inner Class adalah class yang berada dalam class lain
Inner class juga dapat mengakses outerclass 

- private inner class
hanya dapat digunakan didalam car

JAVA ABSTRACTION
abstraction = membuat suatu cetakan (template) yang belum lengkap, kemudian memaksa turunannya untuk melengkapinya

abstract clas bisa memiliki isi yaitu regular method atau abstract method, sedangkan untuk abstract method tidak dapat memiliki isi 

JAVA INTERFACE 
Interface adalah kontrak yang berisi daftar method yang wajib dimiliki oleh class yang mengimplementasikannya

- interface dapat memiliki konstruktor akan tetapi abstract class bisa
- abstract class bisa memiliki field biasa sedangkan interface hanya konstanta (public static final)
- abstract bisa memiliki method biasa sedangkan interface method adalah kontrak
- hanya bisa mewarisi satu untuk extends dan interface bisa implement banyak interface

CARA MEMBEDAKAN ABSTRACT CLASS DAN INTERFACE
- Gunakan abstract class jika hubungan yang dimiliki adalah "is-a" (adalah)
cth: Developer adalah Employee

- Gunakan interface jika hubungan yang dimiliki adalah "can-do" (bisa melakukan sesuatu)
cth: Burung bisa terbang
Ikan bisa berenang

ANONYMUS CLASS
- class tanpa nama yang dibuat dan digunakan secara langsung
tujuan: tidak perlu membuat file class baru
hanya digunakan untuk sekali saja


JAVA ENUMERATIONS
- Enum merupakan kumpulan nilai tetap (fixed values) yang sudah ditentukan sebelumnya.
artinya nilaiya tidak akan berubah ketika program berjalan
- enum juga dapat digunakan menggunakan loop (for each ) dengan menggunakan method .values

KAPAN MENGGUNAKAN ENUM:
- Nilai sudah diketahui
- Jumlahnya tetap
- Tidak berubah


