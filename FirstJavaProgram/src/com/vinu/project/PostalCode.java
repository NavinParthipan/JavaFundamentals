package com.vinu.project;

public class PostalCode {
	public static void main(String args[])
	{
		String postcode="8R4709";
		if(postcode.length()==7)
		{
			{};
		}
		else
		{
			
			postcode = postcode.substring(0,3)+" "+postcode.substring(3);
		}
		System.out.println(postcode);
	}

}
