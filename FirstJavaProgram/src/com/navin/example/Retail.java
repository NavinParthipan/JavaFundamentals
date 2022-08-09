package com.navin.example;

public class Retail {
	private int billId,customerId,discount;
	private double billAmount,discountedBillAmount;
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public double getDiscountedBillAmount()
	{
		discountedBillAmount=(billAmount-(billAmount*((double)discount/100)));
		return discountedBillAmount;
	}
	public static void main(String args[])
	{
		Retail cust1=new Retail();
		cust1.setBillId(1);
		System.out.println("Bill ID: "+cust1.getBillId());
		cust1.setCustomerId(101);
		System.out.println("Customer Id: "+cust1.getCustomerId());
		cust1.setDiscount(16);
		System.out.println("Discount perc: "+cust1.getDiscount());
		cust1.setBillAmount(1001);
		System.out.println("Bill Amount: "+cust1.getBillAmount());
		System.out.println("Discounted Bill Amount: "+cust1.getDiscountedBillAmount());
	}
	

}
