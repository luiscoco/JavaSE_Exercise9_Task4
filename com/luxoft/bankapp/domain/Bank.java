package com.luxoft.bankapp.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;

    public Bank() {
        clients = new ArrayList<>();
    }

    public void addAccount(Account account) {
        Client client = new Client("New Client", 10000, Gender.MALE);
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
