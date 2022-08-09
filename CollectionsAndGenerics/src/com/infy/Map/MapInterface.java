package com.infy.Map;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;

class Course{
	private String courseName;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString()
	{
		return courseName;
	}
}

public class MapInterface {
	public static void main(String args[])
	{
		Set<Course> courseSet1 = new HashSet<>();
		courseSet1.add(new Course("Java"));
		courseSet1.add(new Course("DBMS"));
		
		Set<Course> courseSet2 = new HashSet<>();
		courseSet2.add(new Course("PHP"));
		courseSet2.add(new Course("HTML"));
		courseSet2.add(new Course("CSS"));
		
		Map<Integer,Set<Course>> studentCourses = new HashMap<>();
		studentCourses.put(1001,courseSet1);
		studentCourses.put(1002, courseSet2);
		studentCourses.put(1003, courseSet2);
		
		//Retrieving the set of courses by studentId using get()method
		Set<Course> courseSet = studentCourses.get(1001);
		System.out.println("Retrieving the set of courses by StudentId ");
		System.out.println(courseSet);
		
		//Iterating over the set of keys using for-each loop
		Set<Integer> setOfKeys = studentCourses.keySet();
		System.out.println("Iterationg over the set of keys using for-each loop");
		for(Integer i:setOfKeys)
		{
			System.out.println(studentCourses.get(i));
		}
		
		//Iterating over the collection using values() method
		System.out.println("Iterating over the collection using values() method: ");
		for (Set<Course> courses : studentCourses.values()) {
			System.out.println(courses);
		}
		
	}
}
