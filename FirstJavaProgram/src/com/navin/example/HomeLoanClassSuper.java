package com.navin.example;

public class HomeLoanClassSuper extends LoanClassSuper{
	public HomeLoanClassSuper() {
		super(5,8.5f);
	}
	public double calculateEMI(double principal)
	{
		double simpleInterest = (principal*interestRate*tenure)/100;
		double emi = (simpleInterest+principal)/tenure;
		int adiitionalTax = 300;
		emi+=adiitionalTax;
		return emi;
	}

}
