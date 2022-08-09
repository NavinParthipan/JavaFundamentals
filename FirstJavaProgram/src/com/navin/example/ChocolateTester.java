package com.navin.example;

public class ChocolateTester {
	private int barCode,weight,cost;
	private String name;
	public ChocolateTester() {
		barCode=101;
		name="Cadbury";
		weight=12;
		cost=10;
	}
	public void setBarCode(int barCode)
	{
		this.barCode=barCode;
	}
	public int getBarCode()
	{
		return barCode;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String args[])
	{
		ChocolateTester choc1=new ChocolateTester();
		System.out.println(choc1.getBarCode());
		System.out.println(choc1.getName());
		System.out.println(choc1.getWeight());
		System.out.println(choc1.getCost());
		
		System.out.println("");
		ChocolateTester choc2=new ChocolateTester();
		choc2.setBarCode(102);
		System.out.println(choc2.getBarCode());
		choc2.setName("Hershey's");
		System.out.println(choc2.getName());
		choc2.setWeight(24);
		System.out.println(choc2.getWeight());
		choc2.setCost(50);
		System.out.println(choc2.getCost());
	}

}
