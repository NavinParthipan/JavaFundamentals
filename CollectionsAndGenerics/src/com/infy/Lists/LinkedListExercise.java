package com.infy.Lists;
import java.util.LinkedList;
import java.util.ListIterator;

class Trainer{
	private String name;
	public Trainer(String name) {
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
public class LinkedListExercise {
	public static void main(String args[])
	{
		LinkedList<Trainer> trainerNameList = new LinkedList<>();
		
		trainerNameList.addFirst(new Trainer("Ramesh"));
		trainerNameList.addFirst(new Trainer("Vinu"));
		trainerNameList.add(new Trainer("Navin"));
		trainerNameList.addLast(new Trainer("Raja"));
		trainerNameList.addLast(new Trainer("Karthik"));
		
		ListIterator<Trainer> trainerNameListIterator = trainerNameList.listIterator();
		
		System.out.println("Iterating from front:");
		while(trainerNameListIterator.hasNext())
		{
			Trainer t = trainerNameListIterator.next();
			System.out.println(t);
		}
		
		System.out.println("Iterating from back");
		while(trainerNameListIterator.hasPrevious()) {
			Trainer t = trainerNameListIterator.previous();
			System.out.println(t);
		}
		
		trainerNameList.removeFirst();
		trainerNameList.removeLast();
		
		System.out.println("Trainer name list after removing first and last");
		for(Trainer t:trainerNameList)
		{
			System.out.println(t);
		}
		
		System.out.println("Traversing trainerNameList using for loop");
		for(int i=0;i<trainerNameList.size();i++)
		{
			System.out.println(trainerNameList.get(i));
		}
		
	}
}
