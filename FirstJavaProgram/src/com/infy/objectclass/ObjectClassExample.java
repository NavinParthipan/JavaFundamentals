package com.infy.objectclass;

public class ObjectClassExample {
	public static void main(String args[])
	{
		Integer i=new Integer(5);
		System.out.println(i);
		System.out.println(i.getClass());
		System.out.println(i.hashCode());
		System.out.println(i.toString());
		System.out.println(i.getClass());
		String o="Navin";
		System.out.println(o.hashCode());
		Integer ab =new Integer(10);
		Integer bc =new Integer(10);
		System.out.println(ab.equals(bc));
		System.out.println(ab.hashCode());
		System.out.println(bc.hashCode());
	}

}
