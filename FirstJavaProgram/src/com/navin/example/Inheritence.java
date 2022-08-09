package com.navin.example;

public class Inheritence {
	int tenure;
	double principal;
	float interestRate;
	String accountNumber;

	public double calculateEMI() {
		double simpleInterest = (principal * interestRate * tenure) / 100;
		return (simpleInterest + principal) / tenure;
	}
}
