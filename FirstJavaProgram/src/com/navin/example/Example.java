package com.navin.example;

public class Example {
	public static void main(String args[])
	{
		String nav="DAGA|CGJM C";
		String retstr="";
		int signal=0;
		for(int i=0;i<nav.length();i++)
		{
			if(signal==1)
			{
				retstr+=nav.charAt(i);
			}
			if(nav.charAt(i)=='|')
			{
				signal=1;
			}
			
		}
		System.out.println(retstr);
			
	}
	

}
