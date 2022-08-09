package com.infy.arithmeticException;

public class AssertKeyword {
	public void divide(int m,int n)
	{
		//instead of using if and throw assert is used
		//assert will check the boolean condition in first part if false JVM will return assertion error along with the value that present in the second part
		//the second part must return a value 
		//use assert to check for null values and empty optional
		assert n!=0: "The 'n' value should not be null";
		int x=m/n;
		System.out.println(x);
	}
	public static void main(String args[])
	{
		AssertKeyword obj1 = new AssertKeyword();
		try {
			obj1.divide(10, 10);
		}
		catch(Exception e)
		{
			System.out.println("Ex occured");
		}
	}
}
