package com.navin.example;

public class CheckAmsLucky {
	public static void main(String args[])
	{
		Amstrong obj1=new Amstrong();
		LuckyNumber obj2=new LuckyNumber();
		int a=1623;
		int val1=obj1.calcAmstrong(a);
		int val2=obj2.calcLucky(a);
		if(val1==a && val2%9==0)
		{
			System.out.println(a+" is an Amstrong number and lucky number");
		}
		else if(val1==a && val2%9 !=0)
		{
			System.out.println(a+" is an Amstrong number but not lucky number");
		}
		else if(val1!=a && val2%9==0)
		{
			System.out.println(a+" is not an Ams Numb but it is Lucky ");
		}
		else 
		{
			System.out.println(a+" is neither Ams nor Lucky");
		}
	}

}
