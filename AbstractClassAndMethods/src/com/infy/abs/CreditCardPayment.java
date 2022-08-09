package com.infy.abs;

public class CreditCardPayment extends RRPaymentServices{
	private String paymentId;
	private static int counter;
	private double cashBack,balanceDue;
	CreditCardPayment(double balance,int customerId)
	{
		super(balance,customerId);
	}
	static {
		counter=1000;
	}
	public String getPaymentId()
	{
		paymentId="S"+counter++;
		return paymentId;
	}
	public double getCashBack()
	{
		return cashBack;
	}
	public double getBalanceDue()
	{
		return balanceDue;
	}
	public void payBill(double amount)
	{
		if(amount>super.getBalance())
		{
			cashBack=amount-super.getBalance();
		}
		else if(amount<super.getBalance())
		{
			balanceDue=super.getBalance()-amount;
		}
		else
		{
			{};
		}
		System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+" . Payment Details are-");
		System.out.println("**********************************************************************************************");
		System.out.println("Customer ID  :    "+super.getCustomerId());
		System.out.println("Payment ID  :    "+getPaymentId());
		System.out.println("Previous Due  :    Rs."+super.getBalance());
		System.out.println("Remaining Due  :    Rs."+getBalanceDue());
		System.out.println("CashBack wallet Balance  :    Rs."+getCashBack());
	}
}
