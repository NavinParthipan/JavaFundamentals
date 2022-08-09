package com.navin.example;

public class Account {
	private double balance;
	public void setBalanace(double balance) {
		this.balance=balance;
	}
	public double getBalance(int id) {
		return balance;
	}
	public static void main(String args[]) {
		Account accnt=new Account();
		accnt.setBalanace(1000);
		double value=accnt.getBalance(0);
		System.out.println(value);
	}

}
