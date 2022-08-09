package com.infy.abs;

public class ShoppingPayment extends RRPaymentServices{
	private static int counter;
	private String paymentId;
	static
	{
		counter=1000;
	}
	
	ShoppingPayment(double balance,int customerId)
	{
		super(balance,customerId);
	}
	public String getPaymentId()
	{
			paymentId = "C"+counter++;
			return paymentId;
	}
	public void payBill(double amount)
	{
		if(amount!=super.getBalance())
		{
			if(amount>super.getBalance())
			{
				System.out.println("Excess amount entered!!Please try again");
			}
			else
			{
				System.out.println("Insufficient amount entered!!Please try again");
			}
		}
		else
		{
			System.out.println("Congratulations!! Your payment of Rs."+amount+" is successful with payment id:" +getPaymentId());
		}
	}
	
	
}
