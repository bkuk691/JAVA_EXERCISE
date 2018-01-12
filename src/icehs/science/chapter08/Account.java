package icehs.science.chapter08;

public class Account {
	private String name;
	private int balance;
	private double interestRate;
	
	public Account(String name, int balance, double interestRate) {
		this.name = name;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		int interest = (int)(balance * interestRate/100);
		balance += interest;
		
	}

}
