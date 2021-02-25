package com.test.question2.dao;

public abstract class Account {
	private Owner owner;
	private float balance;
	private String number;

	public Account() {
	}

	public Account(Owner owner, String number, float balance) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}

	public Account(Account account) {
		this.owner = account.getOwner();
		this.balance = account.getBalance();
		this.number = account.getNumber();
	}

	public Owner getOwner() {
		return owner;
	}
	
	public Owner setOwner(Owner owner) {
		return this.owner = owner;
	}


	public float getBalance() {
		return balance;
	}
	
	public float setBalance(float balance) {
		return this.balance = balance;
	}


	public String getNumber() {
		return number;
	}
	
	public String setNumber(String number) {
		return this.number = number;
	}


	public void print() {
		owner.print();
		System.out.println("account number: " + this.number+ "total balance: " + this.balance);
	}

	public abstract void deposit(float amount);

	public abstract void withdraw(float amount);

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}
}