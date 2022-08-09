package com.navin.example;

public class LuckyNumber {
	int sum=0;
	public int calcLucky(int l)
	{
		String str=String.valueOf(l);
		for(int i=1;i<str.length();i+=2){
			char s=str.charAt(i);
			int a=Character.getNumericValue(s);
			sum+=a*a;
		}
		return sum;
	}

}
