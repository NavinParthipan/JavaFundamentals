package com.infy.Lists;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class Employee{
	private String name;
	public Employee(String name)
	{
		this.name=name;
	}
	public String toString()
	{ 
		return name;
	}
}

public class ArrayListExercise {
	public static void main(String args[])
	{
		/*int m=1;
		int nm=(++m)+(m++)+(--m);
		System.out.println(nm);*/
		
		List<Employee> nameList = new ArrayList<>();
		
		nameList.add(new Employee("Navin"));
		nameList.add(new Employee("Vinu"));
		nameList.add(new Employee("Karthik"));
		nameList.add(new Employee("Raja"));
		
		ListIterator<Employee> nameListIterator = nameList.listIterator();
		
		System.out.println("Iterting the listIterator from front");
		while(nameListIterator.hasNext())
		{
			Employee e = nameListIterator.next();
			System.out.println(e);
		}
		
		System.out.println("Iterating the listIterator from back");
		while(nameListIterator.hasPrevious())
		{
			Employee e = nameListIterator.previous();
			System.out.println(e);
		}
		
		
		
	}
}
