package com.infy.arithmeticException;
public class Tester {
	public static void main(String[] args) {
		try{
			System.out.println(Double.valueOf("420.00"));
		}
		catch(NumberFormatException ex){
			System.out.println("NumberFormatException occurred");
			
		}
		catch(Exception e){
			System.out.println("Some exception occurred");
		}
	}

}
