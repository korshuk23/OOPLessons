package oop.practice.clases.bankaccount;

public class Account {
    private int id;
    private boolean isBlock;
    private double balance;
    private static int counter;

    public Account(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public Account(double balance) {
        this.id = ++counter;
        this.balance = balance;
        this.isBlock = false;
    }

    public String getStatus() {
        String status = isBlock ? "Blocked" : "Unlocked";
        return String.format("Account %d %s.", id, status);
    }

    public int getId() {
        return id;
    }

    public void block() {
        this.isBlock = true;
    }

    public double getBalance() {
        return balance;
    }
}
