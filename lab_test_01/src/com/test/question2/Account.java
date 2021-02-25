package com.test.question2;

public class Account {
	 private Owner owner;
	 private float balance;
	 private String number;
	 
	 public Account() {}

	public Account(Owner owner, float balance, String number) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	 
	 public Account (Account a) {};
	 
	public void input() {
	};

	public void print() {
	};
	 
	 public void deposit() {};
	 public void withdraw() {}
	 
	 

	public float getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", number=" + number + "]";
	};
	 
	 
	
	 
	 
}
