package com.navin.example;
import java.util.Arrays;

public class TesterRegistration {
	public static void main(String args[])
	{
		long[] tele=new long[2];
		tele[0]=9452425421L;
		tele[1]=7676765252L;
		
		Registration registration = new Registration("Kevin","MN9891N",tele);
		System.out.println(registration.getCustomerName());
		System.out.println(registration.getPassportNo());
		System.out.println(Arrays.toString(registration.getTelephoneNo()));
	}
}
