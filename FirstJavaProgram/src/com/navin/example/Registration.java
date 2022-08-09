package com.navin.example;

public class Registration {
	private String customerName,panCardNo,passportNo;
	private int voterId,licenseNo;
	private long[] telephoneNo;
	
	public Registration(String customerName, String passportNo, long[] telephoneNo)
	{
		this.customerName=customerName;
		this.passportNo=passportNo;
		this.telephoneNo=telephoneNo;
	}
	
	public Registration(String customerName, int licenseNo, String panCardNo, long[] telephoneNo)
	{
		this.customerName = customerName;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.telephoneNo = telephoneNo;
	}
	
	public Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo)
	{
		this.customerName = customerName;
		this.voterId = voterId;
		this.licenseNo = licenseNo;
		this.telephoneNo = telephoneNo;
	}
	
	public Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo)
	{
		this.customerName = customerName;
		this.panCardNo = panCardNo;
		this.voterId = voterId;
		this.telephoneNo = telephoneNo;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public int getVoterId()
	{
		return voterId;
	}
	
	public String getPassportNo()
	{
		return passportNo;
	}
	
	public int getLicenseNo()
	{
		return licenseNo;
	}
	
	public String getPanCardNo()
	{
		return panCardNo;
	}
	
	public long[] getTelephoneNo()
	{
		return telephoneNo;
	}

}
