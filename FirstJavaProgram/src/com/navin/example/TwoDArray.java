package com.navin.example;

public class TwoDArray {
	public static void main(String args[])
	{
		int x[]= {5,6,7,8};
		int y[]= {7,9,6,5};
		int z[]= {9,6,7,5};
		
		int p[][]= { {5,6,7,8},{7,9,6,5},{9,6,7,5}};
		for(int i=0;i<3;i++) // i denotes no of rows
		{
			for(int j=0;j<4;j++) // j denotes no of columns
			{
				System.out.print(p[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("*******************");
		
		//enhanced for loop
		for(int i[]:p)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		System.out.println("*******************");
		
		System.out.println("Jagged array");
		//Example of jagged array
		int k[][]= { {5,6,7,8},{7,9},{9,6,7}};
		int l[][] = new int[3][];
		l[0] = new int[4];
		l[1] = new int[2];
		l[2] = new int[3];
	}

}
