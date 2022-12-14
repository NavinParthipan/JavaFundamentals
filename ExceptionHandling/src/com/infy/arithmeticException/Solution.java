package com.infy.arithmeticException;

import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public static long power(int a, int b)throws Exception
    {
        long ans;
        if(a==0 && b==0)
        {
        	throw new Exception("n and p should not zero.");
        }
        else if(a<0 || b<0){
            throw new Exception("n or p should not be negative.");
        }
        else
        {
        	ans=1;
            for(int i=1;i<=b;i++)
            {
            	ans*=a;
            }
            return ans;
        }
 
    }

}

public class Solution {
	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("a");
		}
	}
}