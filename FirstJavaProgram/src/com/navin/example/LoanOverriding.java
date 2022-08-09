package com.navin.example;

public class LoanOverriding {
	public double calculateEMI(double principal){
        double simpleInterest = (principal * 8.5 * 5) / 100;
        return (simpleInterest+principal)/5;
    }
}

