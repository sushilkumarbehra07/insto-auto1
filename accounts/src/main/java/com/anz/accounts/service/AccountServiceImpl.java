package com.anz.accounts.service;

import com.anz.accounts.dao.AccountDAO;
import com.anz.accounts.io.Account;
import com.anz.accounts.io.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    public List<Account> getListOfAccount(int customerid) {
        return accountDAO.getAccounts(customerid);
    }

    @Override
    public List<Transactions> getTransactions(int accountNumber)
    {
        return accountDAO.getTransactions(accountNumber);
    }
}
