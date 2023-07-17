package com.luxoft.bankapp.domain;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    double maximumAmountToWithdraw();
}
