package com.navin.example;

public class ExecuteLoanClassSuper {
	public static void main(String args[])
	{
		HomeLoanClassSuper homeLoanClassSuper = new HomeLoanClassSuper();
		double res = homeLoanClassSuper.calculateEMI(2000);
		System.out.println("Your EMI bill: "+res);
	}

}
