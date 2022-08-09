package com.infy.objectclass;

public class Customer {
	private String customerName;
	private int customerId;
	
	public Customer(int customerId, String customerName)
	{
		this.customerId=customerId;
		this.customerName=customerName;
		
	}
	
	public int hashCode()
	{
		return customerId;
	}
	
	public boolean equals(Object ob)
	{
		Customer cust = (Customer) ob;
		if(this.hashCode()==cust.hashCode())
		{
			System.out.println(this.hashCode());
			System.out.println(cust.hashCode());
			return this.customerName.equals(cust.customerName);
		}
		
		return false;
	}
	
	public static void main(String args[])
	{
		Customer customer1 = new Customer(13,"Ajay");
		Customer customer2 = new Customer(13,"Ajay");
		if(customer1.equals(customer2))
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
	}

}
