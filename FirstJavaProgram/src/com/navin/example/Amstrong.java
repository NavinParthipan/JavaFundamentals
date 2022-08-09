package com.navin.example;

public class Amstrong {
	int sum=0;
	public int calcAmstrong(int num)
	{
		while(num>0) {
			int rem=num%10;
			sum+=rem*rem*rem;
			num/=10;
		}
		return sum;
	}

}
