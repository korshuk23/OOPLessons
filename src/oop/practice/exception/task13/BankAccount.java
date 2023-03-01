package oop.practice.exception.task13;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
