package com.infy.Objects;

public class StudentRegistration {
	private String studentName;
	private double age;
	private int admissionNumber,rollNumber,counter=1001;
	
	public StudentRegistration(String studentName,double age,int admissionNumber)
	{
		this.studentName = studentName;
		this.age = age;
		this.admissionNumber = admissionNumber;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public double getAge()
	{
		return age;
	}
	
	public int getAdmissionNumber()
	{
		return admissionNumber;
	}
	
	public int getRollNumber()
	{
		return rollNumber;
	}
	public void generateRollNumber()
	{
		rollNumber=counter++;	
	}
	
	public int hashCode()
	{
		return admissionNumber;
	}
	
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		
		if(obj==null || this.getClass()!=obj.getClass())
		{
			return false;
		}
		
		StudentRegistration stud = (StudentRegistration) obj;
		if(this.hashCode()==obj.hashCode())
		{
			return this.studentName.equals(stud.studentName);
		}
		return false;
		
		
	}
	
}
