package com.anz.accounts.dao;

import com.anz.accounts.io.Account;
import com.anz.accounts.io.Transactions;
import com.anz.accounts.util.FileUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    FileUtils fileUtils;

    @Override
    public List<Account> getAccounts(int customerid) {
        List<Account> accounts = new ArrayList<>();
        try {
            accounts = FileUtils.readAccountJsonWithObjectMapper();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    @Override
    public List<Transactions> getTransactions(int accountnumber) {
        List<Transactions> transactions = new ArrayList<>();
        try {
            transactions = FileUtils.readTransactionsJsonWithObjectMapper();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactions;
    }
}
