package com.vinu.project;

public class PhoneNum {
	public static void main(String args[])
	{
		String phoneNumber="1098765432"; 
		char[] arr1=phoneNumber.toCharArray();
		String pho="";
		for(int i=0;i<arr1.length;i++)
		{
			if(i==3||i==6)
			{
				pho+="-";
			}
			pho+=arr1[i];
		}
		System.out.println(pho);
		
	}
	
	

}
