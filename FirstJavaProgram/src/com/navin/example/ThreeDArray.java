package com.navin.example;

public class ThreeDArray {
	public static void main(String args[])
	{
		int a[][][] = new int[3][3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					a[i][j][k]=i+j+k;
				}
			}
		}
		for(int i[][]:a)
		{
			for(int j[]:i)
			{
				for(int k:j)
				{
					System.out.print(" "+k);
				}
				System.out.println("");
			}
			System.out.println("************");
		}
		
	}

}
