package com.navin.example;

public class HomeLoanSuper extends LoanSuper{
	public double calculateEmi(double principal)
	{
		double emi=super.calculateEmi(principal);
		int additionalTax=100;
		emi=emi+additionalTax;
		return emi;	
	}
	public static void main(String args[])
	{
		HomeLoanSuper homeLoanSuper = new HomeLoanSuper();
		double res = homeLoanSuper.calculateEmi(2000);
		System.out.println("Your emi bill: "+res);
	}

}
