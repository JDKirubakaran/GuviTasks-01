package com.demo.task2.oops;

public class Account3 {
	double balance;
    // Constructor with no arguments
    public Account3() {
        balance = 0.0;
    }
    // Constructor with two arguments
    public Account3(double initialBalance) {
        balance = initialBalance;
    }
    // Method to deposit the amount to the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }
    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }


}
