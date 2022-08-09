package com.infy.set;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

public class Tester {
	public static void main(String args[])
	{
		Student stud1 = new Student("Navin",123,30);
		Student stud2 = new Student("Raja",122,80);
		Student stud3 = new Student("Vinu",111,50);
		Student stud4 = new Student("Navin",123,50);
		Student stud5 = new Student("Karthi",110,30);
		
		stud1.calculateGrade();
		stud2.calculateGrade();
		stud3.calculateGrade();
		stud4.calculateGrade();
		stud5.calculateGrade();
		
		
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(stud1);
		studentSet.add(stud2);
		studentSet.add(stud3);
		studentSet.add(stud4);
		studentSet.add(stud5);

		
		Iterator<Student> studentList = studentSet.iterator();
		while(studentList.hasNext()) {
			System.out.println(studentList.next());
		}
		
		Map<Integer,Grades> marks = new TreeMap<>();
		marks.put(stud1.getRollNumber(),stud1.getGrade());
		marks.put(stud2.getRollNumber(),stud2.getGrade());
		marks.put(stud3.getRollNumber(),stud3.getGrade());
		//marks.put(stud4.getRollNumber(),stud4.getGrade());
		marks.put(stud5.getRollNumber(),stud5.getGrade());
		
		Set<Integer> rollNumSet = marks.keySet();
		for(Integer j: rollNumSet) {
			System.out.println("Roll Number: "+j+" Grade: "+marks.get(j));
		}
		
		

		
		
		
	}
}
