package com.luxoft.bankapp.domain;

public class Client {
    private String name;
    private Account account;
    private Gender gender;

    public Client(String name, double initialBalance, Gender gender) {
        this.name = name;
        this.gender = gender;

        if (gender == Gender.MALE) {
            this.account = new SavingAccount(1, initialBalance);
        } else if (gender == Gender.FEMALE) {
            this.account = new CheckingAccount(1, initialBalance, 2000.0);
        }
    }
    
    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public String getClientGreeting() {
        return gender.getGreeting() + " " + name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
