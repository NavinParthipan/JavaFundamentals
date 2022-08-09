package com.navin.example;

class Student2 extends Person2{
	Student2(){
       System.out.println("In Student class");
    }
	int id;
	public static void main(String[] a){
		Student2 ob=new Student2(); //Line 1
		ob.name="abc"; //Line 2
		ob.id=123;
}
}
