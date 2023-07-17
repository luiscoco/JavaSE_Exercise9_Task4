package com.luxoft.bankapp.domain;

public abstract class AbstractAccount implements Account {
    protected int id;
    protected double balance;

    public AbstractAccount(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
