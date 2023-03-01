package oop.practice.exception.task13;

public class Runner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2000);
        try {
            bankAccount.withdraw(2200);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
