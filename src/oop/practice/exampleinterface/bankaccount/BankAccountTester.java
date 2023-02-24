package oop.practice.exampleinterface.bankaccount;

public class BankAccountTester {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        savingsAccount.deposit(400);
        savingsAccount.withdraw(300);
        checkingAccount.deposit(3400);
        checkingAccount.withdraw(1400);

        System.out.println("Savings account balance: " + savingsAccount.getBalance() +
                "\nChecking account balance: " + checkingAccount.getBalance());

        checkingAccount.calculateInterest();
        System.out.println("Checking account balance after interest: " + checkingAccount.getBalance());
    }
}
