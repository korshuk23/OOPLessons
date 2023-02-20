package oop.practice.clases.bankaccount;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    private String name;
    private ArrayList<BankClient> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClient(BankClient... client) {
        this.clients.addAll(Arrays.asList(client));
    }

    public BankClient getClient(String passportId) {
        for (BankClient client : clients) {
            if (client.getPassportId().equals(passportId)) {
                return client;
            }
        }
        return null;
    }
}
