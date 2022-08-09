package com.infy.String;

public class Tester {
	public static void main(String args[])
	{
		LocationChanger emp1 = new LocationChanger();
		LocationChanger emp2 = new LocationChanger();
		
		emp1.setName("Annabelle Micheal");
		emp1.setLocation("BL003,Delhi,STP");
		
		emp2.setName("Jissele James");
		emp2.setLocation("FL091,Pune,SEZ");
		
		emp1.welcomeEmployee();
		emp1.checkCity();
		emp1.editAddress();
		System.out.println("*********************************");
		emp2.welcomeEmployee();
		emp2.checkCity();
		emp2.editAddress();
	}
}
