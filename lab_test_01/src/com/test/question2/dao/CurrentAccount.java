package com.test.question2.dao;

public class CurrentAccount extends Account{
	private float minimumBalance;

	public CurrentAccount() {}
	
	public CurrentAccount(CurrentAccount currentAccount) {
		super(currentAccount);
		this.minimumBalance = currentAccount.minimumBalance;
	}

	public float getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public float getCharges() {
		return minimumBalance*5;
	}
	public void input() {}
	
	@Override
	public void print() {
		super.toString();
		System.out.println("Minimum balance: " + this.minimumBalance);
	}

	@Override
	public String toString() {
		return "CurrentAccount [minimumBalance=" + minimumBalance + "]";
	}

	@Override
	public void deposit(float amount) {
		float newBalance = this.getBalance() + amount;
		this.setBalance(newBalance);
	}

	@Override
	public void withdraw(float amount) {
		float newBalance = this.getBalance() - amount;
		if(newBalance < minimumBalance) {
			System.out.println("Low balance");
		}else {
			this.setBalance(newBalance);
		}
	}
	
}