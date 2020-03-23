package com.anz.bank.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.anz.accounts.io.Transactions;
import com.anz.accounts.service.AccountService;

public class TestAccounts {
	@Autowired
	AccountService accountService;
	
	@Test
	public void testAccountList() {
		List<Transactions> transactionList = accountService.getTransactions(585309209);
		assertEquals(4, transactionList.size());
	}
}
