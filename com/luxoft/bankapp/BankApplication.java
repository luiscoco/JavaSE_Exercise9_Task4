package com.luxoft.bankapp;

import java.util.List;

import com.luxoft.bankapp.domain.*;
import com.luxoft.bankapp.service.BankService;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create different types of accounts
        Account account1 = new SavingAccount(1, 1000.0);
        Account account2 = new CheckingAccount(2, 5000.0, 2000.0);

        // Add accounts to the bank
        BankService.addAccount(bank, account1);
        BankService.addAccount(bank, account2);

        // Modify account balances
        modifyBank(bank);

        // Print account balances and maximum withdrawal amounts
        printBalanceAndMaxWithdrawal(bank);
    }

    public static void modifyBank(Bank bank) {
        List<Client> clients = bank.getClients();
        // Modify account balances
        for (Client client : clients) {
            Account account = client.getAccount();
            account.deposit(500.0); // Deposit $500
            account.withdraw(200.0); // Withdraw $200
        }
    }

    public static void printBalanceAndMaxWithdrawal(Bank bank) {
        for (Client client : bank.getClients()) {
            Account account = client.getAccount();
            System.out.println(client.getClientGreeting() + "'s account balance: $" + account.getBalance());
            System.out.println("Maximum amount to withdraw: $" + account.maximumAmountToWithdraw());
        }
    }
}
