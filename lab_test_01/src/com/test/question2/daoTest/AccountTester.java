package com.test.question2.daoTest;

import com.test.question2.dao.CurrentAccount;
import com.test.question2.dao.Date;
import com.test.question2.dao.Owner;


public class AccountTester {
	public static void main(String[] args) {
		
		Date date = new Date(16,11,2020);
		Owner owner = new Owner("Rahul", "32", date);
		
//		SavingAccount account = new SavingAccount();
//		account.setBalance(100000);
//		account.setNumber("475546);
//		account.setOwner(owner);
//		account.setInterestRate(7);
//		account.print();
		
		CurrentAccount account2 = new CurrentAccount();
		account2.setBalance(1000000);
		account2.setOwner(owner);
		account2.setNumber("45676");
		account2.setMinimumBalance(2000);
		
	}
}
