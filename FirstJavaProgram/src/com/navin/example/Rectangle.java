package com.navin.example;

public class Rectangle {
	private int length,breadth;
	
	public int getLength()
	{
		return length;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public int getBreadth()
	{
		return breadth;
	}
	public void setBreadth(int breadth)
	{
		this.breadth=breadth;
	}
	public int area()
	{
		return breadth*length;
	}
	public void perimeter()
	{
		int peri=2*(length+breadth);
		System.out.println("perimeter is: "+peri);
	}
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle();
		rect.setBreadth(100);
		rect.setLength(50);
		int Area=rect.area();
		System.out.println("Area of rectangle is: "+Area);
		rect.perimeter();
		
	}
	

}
