package com.test.question2;

public class SavingAccount extends Account{
	private float interestRate;

	public SavingAccount() {
	}

	public SavingAccount(SavingAccount tempAccount) {
		super(tempAccount);
		this.interestRate = tempAccount.interestRate;
	}
	
	

	public float getInterest() {
		return interestRate*(this.getBalance());
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
	public float getInterestRate() {
		return interestRate;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Interest rate: " + this.interestRate);
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + "]";
	}

	@Override
	public void deposit(float amount) {
		float newBalance = this.getBalance() + amount;
		this.setBalance(newBalance);
	}

	@Override
	public void withdraw(float amount) {
		float newBalance = this.getBalance() - amount;
		if(newBalance < 0) {
			System.out.println("Low Balance");
		}else {
			this.setBalance(newBalance);
		}
	}
	

	
}
