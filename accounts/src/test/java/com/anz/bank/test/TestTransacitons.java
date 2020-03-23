package com.anz.bank.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.anz.accounts.io.Account;
import com.anz.accounts.service.AccountService;

public class TestTransacitons {

	@Autowired
	AccountService accountService;
	
	@Test
	public void testAccTransacitons() {
		List<Account> accountList = accountService.getListOfAccount(585309209);
		assertEquals(4, accountList.size());
	}
}
