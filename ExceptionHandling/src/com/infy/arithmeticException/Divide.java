package com.infy.arithmeticException;

public class Divide {
	public static void calc(int m, int n) {
		try {
			int p = m / n;
			System.out.println(p);
		} catch (ArithmeticException ex) {
			System.out.println("The divisor should not be zero");
		}
		 finally  {
	            System.out.println("Inside finally");
	        }
	}

	public static void divide(int x, int y) {
		try {
			int z = x/y;       // If an exception occurs here, the control jumps to the first matching catch block
	        System.out.println(z);       // Execution of this line will be skipped
	        }
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Index not found");
			}
		catch(ArithmeticException exception) {       // This is the matching exception handler
			System.out.println("The divisor should not be zero");
			System.out.println(exception);
			exception.printStackTrace();
			System.out.println(exception.getMessage());
			System.out.println(exception.toString());
			}
		System.out.println("Method execution ends");       // Program execution continues from here
		}
	public static void divides(int x, int y) {
		try {
			if(y == 0) 
			{
				throw new Exception("The divisor should not be zero");
			}
			else {
				int  z=x/y;
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage()); 
				}
		}

	public static void main(String args[]) {
		Divide.calc(100, 0);
		Divide.divide(100, 0);
		Divide.divides(10, 0);
	}

}
