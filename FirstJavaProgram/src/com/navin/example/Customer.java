package com.navin.example;

public class Customer {
	private String customerName;
	private String customerId;
	Customer(String uname,String uId)
	{
		customerName=uname;
		customerId=uId;
	}
	public String displayCustomerName()
	{
		return customerName;
	}
	public String displayCustomerId()
	{
		return customerId;
	}

}
