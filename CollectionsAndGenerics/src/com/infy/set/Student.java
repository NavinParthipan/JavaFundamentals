package com.infy.set;
enum Grades{A,B,C};

public class Student {
	private String name;
	private int rollNumber;
	private int marks;
	Grades grade;
	
	public Student(String name,int rollNumber,int marks)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	public int hashCode()
	{
		return rollNumber;
	}
	
	public void calculateGrade()
	{
		if(marks>=60) {
			grade=Grades.A;
		}
		else if(marks>40) {
			grade = Grades.B;
		}
		else {
			grade = Grades.C;
		}
	}
	
	public Grades getGrade()
	{
		return grade;
	}
	
	public boolean equals(Object obj)
	{
		Student stud = (Student) obj;
		return rollNumber==stud.rollNumber;
	}

	public String toString() {
		return name+" "+rollNumber+" "+marks;
	}
	
}

