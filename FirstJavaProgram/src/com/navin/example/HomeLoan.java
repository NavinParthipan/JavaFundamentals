package com.navin.example;
	class HomeLoan extends Inheritence {
		  HomeLoan() {
		    tenure = 5; //reusing super class member variables
		    principal = 20000;
		    interestRate = 10.5f;
		    accountNumber = "Acc12345";
		  }

		public static void main(String[] args) {
		    HomeLoan hloan = new HomeLoan();
		    double amount = hloan.calculateEMI();   // sub class Object
		                                            // invoking super class method
		    System.out.println("emi per year..." + amount);
		  }
		}


