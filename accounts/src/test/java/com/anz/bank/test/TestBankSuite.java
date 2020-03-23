package com.anz.bank.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestAccounts.class,
	TestTransacitons.class
})

public class TestBankSuite {

}
