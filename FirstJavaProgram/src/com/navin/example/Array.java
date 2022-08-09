package com.navin.example;
import java.util.Random;

public class Array {
	public static void main(String args[])
	{
		Random r = new Random(); // in built class imported from java.util package to generate random numbers
		
		int[] arr = new int[25]; //array of size 25 is created to store random numbers
		for(int i=0;i<25;i++)
		{
			arr[i]=r.nextInt(100); // this will assign random numbers from 0 to 100
		}
		try {
			System.out.println(arr[100]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum index for array is 24");
		}
		
		for(int i=0;i<25;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
