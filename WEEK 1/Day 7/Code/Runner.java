// package WEEK 1.Day 7.Code;

public class Runner {
    public static void main(String[] args) {
        // Employee emp = new Employee();
        // emp.setName("Hotmangasi");

        // System.out.println(emp.getName());
        // Versi tanpa menggunakan enkapsulasi
        // BankAccount obj = new BankAccount();
        // obj.setBalance(50000);

        // System.out.println(obj.getBalance());

        // Case 2
        // Employee emp = new Employee();
        // emp.age = 1000;
        // System.out.println(emp.age);

        // Case 2 menggunakan enkapsulasi
        // Employee emp = new Employee();
        // emp.setAge(56);
        // System.out.println(emp.getAge());

        // Case 3: password yang hanya bisa di set tapi tidak bisa di get (dibaca)
        Employee emp = new Employee();
        emp.setPassword("secret123");
    }
}
