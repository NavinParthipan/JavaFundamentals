package com.navin.example;

public class BankConstructor {
	private String bankName,branch;
	private String phone;
	BankConstructor() {
		bankName="IOB";
		branch="Mukkudal";
		phone="9000234567";
	}
	BankConstructor(String bName,String bBranch,String bPhone)
	{
		bankName=bName;
		branch=bBranch;
		phone=bPhone;
	}
	public void displayBankDetails()
	{
		System.out.println("Bank Name: "+bankName);
		System.out.println("Bank Branch: "+branch);
		System.out.println("Bank phone no: "+phone);
	}
	public static void main(String args[])
	{
		BankConstructor bank1 = new BankConstructor();
		bank1.displayBankDetails();
		System.out.println("");
		BankConstructor bank2 = new BankConstructor("IOB","SDPuram","9025233176");
		bank2.displayBankDetails();	
	}
}
