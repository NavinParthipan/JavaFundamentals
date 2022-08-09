package com.navin.example;

public class Bank {
	public static void main(String args[])
	{
		Customer[] customer=new Customer[2];
		Customer customer1=new Customer("Navin", "49");
		Customer customer2=new Customer("Npr","79");
		customer[0]=customer1;
		customer[1]=customer2;
		for(int i=0;i<customer.length;++i)
		{
			Customer customerObject=customer[i];
			String name=customerObject.displayCustomerName();
			String id=customerObject.displayCustomerId();
			System.out.println("Customer name is: "+name+" and id: "+id);
		}
	}
}
