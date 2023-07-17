package com.luxoft.bankapp.service;

import com.luxoft.bankapp.domain.Bank;
import com.luxoft.bankapp.domain.Account;

public class BankService {
    public static void addAccount(Bank bank, Account account) {
        bank.addAccount(account);
    }
}

