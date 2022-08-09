package com.navin.example;

public class PlayerRating {
	private int playerPosition;
	private String playerName;
	private float cricticOneRating;
	private float cricticTwoRating;
	private float cricticThreeRating;
	private float averageRating;
	private char category;
	
	PlayerRating(int playerPosition,String playerName)
	{
		this.playerPosition=playerPosition;
		this.playerName=playerName;
	}
	public void calculateAverageRating(float cricticOneRating,float cricticTwoRating)
	{
		averageRating=(cricticOneRating+cricticTwoRating)/2.0f;
	}
	public void calculateAverageRating(float cricticOneRating,float cricticTwoRating,float cricticThreeRating)
	{
		averageRating=(cricticOneRating+cricticTwoRating+cricticThreeRating)/3.0f;
	}
	public void CalculateCategory()
	{
		if(averageRating>8)
		{
			category='A';
		}
		else if(averageRating>5 && averageRating<8)
		{
			category='B';
		}
		else
		{
			category='C';
		}
	}
	public void display() {
		System.out.println("the player name is "+playerName);
		System.out.println("the player position is "+playerPosition);
		System.out.println("the average player rating is "+averageRating);
		System.out.println("the category is "+category);
	}
	public static void main(String args[]) {
		PlayerRating player1=new PlayerRating(1,"Beckham");
		player1.calculateAverageRating(9.0f, 9.9f);
		player1.CalculateCategory();
		player1.display();
		
	}
	
}