// package WEEK 1.Day 7.Code;

public class BankAccount {
    // Versi 1 tanpa menggunakan enkapsulasi

    // public double balance;

    // Versi 2 dengan menggunakan enkapsulasi
    // Harus menggunakan modifiers private

    private double balance;

    public void setBalance(double balance){
        if(balance < 0){
            System.out.println("Balance cannot be negatif");
            return;
        };
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }

    // setter disini menjadi satpam yaitu validasi agar nilai balance tidak bisa dibawah 0 atau minus dan juga validasi yang lain
}
