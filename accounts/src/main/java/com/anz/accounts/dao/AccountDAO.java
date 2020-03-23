package com.anz.accounts.dao;

import java.util.List;

import com.anz.accounts.io.Account;
import com.anz.accounts.io.Transactions;

public interface AccountDAO {

    List<Account> getAccounts(int customerid);
    List<Transactions> getTransactions(int accountnumber);
}
