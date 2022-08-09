package com.infy.abs;

public abstract class RRPaymentServices {
	private double balance;
	private int customerId;
	
	RRPaymentServices(double balance, int customerId)
	{
		this.balance=balance;
		this.customerId=customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public abstract void payBill(double amount);
}
