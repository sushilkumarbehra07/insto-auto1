package com.anz.accounts.web;

import com.anz.accounts.io.Account;
import com.anz.accounts.io.Transactions;
import com.anz.accounts.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    AccountService accountService;


    @RequestMapping("/")
    public String index() {
        return "Spring Boot Example";
    }

    @GetMapping(value = "/listaccount/customerid/{customerid}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Account> getAccountList(@PathVariable(value = "customerid") final int customerid, Model model) {
        List<Account> accounts = accountService.getListOfAccount(customerid);
        model.addAttribute("accountlist", accounts);
        return accounts;
    }


    @GetMapping(value = "/listtransactions/accountnumber/{accountnumber}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Transactions> getTransactions(@PathVariable(value = "accountnumber") final int accountnumber, Model model) {
        List<Transactions> transactions = accountService.getTransactions(accountnumber);
        model.addAttribute("transactionlist", transactions);
        return  transactions;
    }

}