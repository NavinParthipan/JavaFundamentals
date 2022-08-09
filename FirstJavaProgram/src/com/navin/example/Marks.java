package com.navin.example;

public class Marks {
	int[] marks=new int[5];
	public int[] storeMarks(int m1,int m2,int m3,int m4,int m5)
	{
		marks[0]=m1;
		marks[1]=m2;
		marks[2]=m3;
		marks[3]=m4;
		marks[4]=m5;
		return marks;
	}
	public void displayMarks(int marksArr[])
	{
		int count=1;
		for(int i:marks)
		{
			System.out.println("Subject "+count+": "+i);
			++count;
		}
	}
	public static void main(String args[])
	{
		Marks stu1=new Marks();
		int mark1[]=stu1.storeMarks(90, 100, 80, 70, 80);
		stu1.displayMarks(mark1);
	}

}
