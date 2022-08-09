package com.infy.String;

public class LocationChanger {
	private String name,location;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void checkCity()
	{
		String[] loc = location.split(",");
		switch(loc[1])
		{
			case "Delhi" -> System.out.println("Welcome to Infy Mysore Delhites!");
			case "Trivandrum" -> System.out.println("Welcome to Infy Mysore Trinfy");
			case "Bhubaneshwar" -> System.out.println("You came a long way down South! We welcome you");
			default -> System.out.println("Oops your city name is not listed");
		}
	}
	
	public void editAddress()
	{
		String[] loc = location.split(",");
		if("STP".equals(loc[2]))
		{
			System.out.println("Your location has been changed from STP to SEZ");
		}
		else if("SEZ".equals(loc[2]))
		{
			System.out.println("Your location remains the same!");
		}
	}
	
	public void welcomeEmployee()
	{
		String[] fullName =  name.split(" ");
		System.out.println("Hello "+fullName[0]);
	}
}
