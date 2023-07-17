package com.luxoft.bankapp.domain;

public class CheckingAccount extends AbstractAccount {
    private double overdraft;

    public CheckingAccount(int id, double initialBalance, double overdraft) {
        super(id, initialBalance);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraft) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double maximumAmountToWithdraw() {
        return balance + overdraft;
    }
}
