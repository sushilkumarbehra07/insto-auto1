package com.anz.accounts.service;

import java.util.List;

import com.anz.accounts.io.Account;
import com.anz.accounts.io.Transactions;

public interface AccountService {
    List<Account> getListOfAccount(int customerId);
    List<Transactions> getTransactions(int accountNumber);
}
