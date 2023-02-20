package oop.practice.clases.bankaccount;

import java.util.ArrayList;
import java.util.Comparator;

public class BankClient {
    private String firstName;
    private String lastName;
    private String passportId;
    private final ArrayList<Account> accounts;

    public BankClient(String firstName, String lastName, String passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public String getPassportId() {
        return passportId;
    }

    public Account getAccount(long id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public void blockAccount(long id) {
        for (Account account : accounts) {
            if (account.getId() == id)
                account.block();
        }
    }

    public String getInformation() {
        StringBuilder information = new StringBuilder();
        for (Account account : accounts) {
            information.append(String.format("#%d, balance: %.2f dollars, status: %s\n", account.getId(), account.getBalance(), account.getStatus()));
        }
        return String.format("Client %s %s has accounts: \n%s", firstName, lastName, information.toString());
    }

    public void sortByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public String getBalance() {
        double balance = 0;
        for (Account account : accounts) {
            balance += account.getBalance();
        }
        return String.format("%.2f dollars", balance);
    }

    public String getBalancePositiveAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }
        }
        return String.format("%.2f dollars", balance);
    }

    public String getBalanceNegativeAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }
        return String.format("%.2f dollars", balance);
    }

    public String getFIO() {
        return firstName + " " + lastName + " ";
    }

    public void setFIO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
