package com.infy.arithmeticException;

import java.util.Scanner;

public class UserDefinedExceptionExample {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a nummber greater than 10");
		try{
			int i = s.nextInt();
			if(i<10)
			{
				throw new MyDivException("IncorrectValue");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class MyDivException extends Exception{
	MyDivException(String msg) {
		super(msg);
	}
}


