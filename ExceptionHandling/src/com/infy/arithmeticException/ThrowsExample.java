package com.infy.arithmeticException;

public class ThrowsExample {
	public static void divide(int x, int y) throws Exception {
		if(y == 0) {
			throw new Exception("Hello");
		}
		int z = x/y;
		System.out.println(z);
		}
	public static void main(String args[]) {
		try {
			divide(10, 0); 
		}
		catch(Exception e) {
		System.out.println(e.getMessage()); 
		}
	}

}
