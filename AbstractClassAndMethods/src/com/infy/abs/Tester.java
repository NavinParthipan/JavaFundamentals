package com.infy.abs;

public class Tester {
	public static void main(String args[])
	{
		RRPaymentServices shoppingPayment1 = new ShoppingPayment(5000,561328);
		shoppingPayment1.payBill(5000.0);
		RRPaymentServices shoppingPayment2 = new ShoppingPayment(5000,561329);
		shoppingPayment2.payBill(6000.0);
		RRPaymentServices shoppingPayment3 = new ShoppingPayment(5000,561330);
		shoppingPayment3.payBill(4000.0);
		
		RRPaymentServices creditCardPayment1 = new CreditCardPayment(10000.23, 5001);
		creditCardPayment1.payBill(15000);
		RRPaymentServices creditCardPayment2 = new CreditCardPayment(10000.23, 5001);
		creditCardPayment2.payBill(0);
		RRPaymentServices creditCardPayment3 = new CreditCardPayment(10000.23, 5001);
		creditCardPayment3.payBill(5000);
		
	}

}
