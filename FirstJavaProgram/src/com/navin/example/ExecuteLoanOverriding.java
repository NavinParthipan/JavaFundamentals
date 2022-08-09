package com.navin.example;

public class ExecuteLoanOverriding {
	public static void main(String[] args){
        LoanOverriding loan = null;
        loan = new HomeLoanOverriding();      //Runtime Polymorphism
        double hloan = loan.calculateEMI(2000000);
 
        loan = new VehicleLoanOverriding();   //sup class reference holding sub class Object
        double vloan = loan.calculateEMI(100000);
        System.out.println("Home loan emi per year is..." + hloan);
        System.out.println("Vehicle loan emi per year is..." + vloan);
        
    }
}
