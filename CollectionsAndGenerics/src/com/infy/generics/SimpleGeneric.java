package com.infy.generics;

public class SimpleGeneric<E> {
	private E item;
	public SimpleGeneric(E item) {
		this.item = item;
	}
	public void showObjectType() {
		System.out.println(item.getClass().getName());
	}
	public static void main(String args[])
	{
		SimpleGeneric<String> genClass = new SimpleGeneric<String>("Input");
		genClass.showObjectType();
	}

}


