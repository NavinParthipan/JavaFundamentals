package com.infy.Objects;

public class TesterStudentRegistration {
	public static void main(String args[])
	{
		StudentRegistration student1 = new StudentRegistration("Navin", 19, 376);
		StudentRegistration student2 = new StudentRegistration("Navin", 20, 375);
		
		if(student1.equals(student2))
		{
			System.out.println("Roll number already generated for the student");
		}
		else
		{
			student2.generateRollNumber();
			
			System.out.println("           Student Details      ");
			System.out.println("*********************************");
			System.out.println("Name             :"+student2.getStudentName());
			System.out.println("Admission Number :"+student2.getAdmissionNumber());
			System.out.println("Roll Number      :"+student2.getRollNumber());
		}
	}
}
