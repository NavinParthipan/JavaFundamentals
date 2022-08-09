package com.infy.arithmeticException;

public class TryMathCube {
	public int cube(int n) {
		return n * n * n;
	}

	public static void main(String[] args) {
		try {
			TryMathCube tc = new TryMathCube();
			int num = Integer.parseInt(args[0]);
			System.out.println(tc.cube(num));
		}
		catch(NumberFormatException e)
		{
			System.out.println(e+" has occured and catched");
		}
		catch(Exception e)
		{
			System.out.println(e+" has occured");
		}
		
	}
}
