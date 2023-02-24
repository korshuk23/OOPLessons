package oop.practice.exampleinterface.bankaccount;

public class SavingsAccount implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Not enough funds!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
