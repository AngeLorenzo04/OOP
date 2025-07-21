package oop.basic;

public class BankAccount {


    private double balance;


    public BankAccount() {
        balance = 0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(amount > 0) this.balance -= amount;
    }



}
