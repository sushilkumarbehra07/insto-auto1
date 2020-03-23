package com.anz.accounts.util;

import com.anz.accounts.io.Account;
import com.anz.accounts.io.Transactions;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class FileUtils{
    public static List<Account> readAccountJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Account> accounts = objectMapper.readValue(new File("H:\\Software\\STSWorkspace\\accounts\\src\\main\\resources\\accounts.json"), List.class);
        return accounts;
    }

    public static List<Transactions> readTransactionsJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Transactions> transactions = objectMapper.readValue(new File("H:\\Software\\STSWorkspace\\accounts\\src\\main\\resources\\transactions.json"), List.class);
        return transactions;
    }

}
