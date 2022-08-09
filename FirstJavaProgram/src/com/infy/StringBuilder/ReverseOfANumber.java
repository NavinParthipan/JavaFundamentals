package com.infy.StringBuilder;

public class ReverseOfANumber {
	public static void main(String args[])
	{
		int number=45687;
	    String copy = Integer.toString(number);
	    StringBuilder sb = new StringBuilder(copy);
	    int reverse = Integer.parseInt(sb.reverse().toString());
	    if(number==reverse)
	    {
	    	System.out.println(number+" is a palindrome");
	    }
	    else
	    {
	    	System.out.println(number+" is not a palindrome");
	    }
	    System.out.println("Reverse:"+reverse);
	}
}
