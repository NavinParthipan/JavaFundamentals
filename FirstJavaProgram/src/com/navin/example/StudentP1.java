package com.navin.example;

public class StudentP1 extends Person1 {
	void Print() {
		System.out.println("student name" + name);
	}

	StudentP1() {
		System.out.println("In Student class");
	}

	int id;

	public static void main(String[] args) {
		Person1 person = null;
		person = new StudentP1();
		person.name = "abc";
		person.Print();
	}
}