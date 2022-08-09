package com.navin.example;

public class UpdatedSwitch {
	public static void main(String args[])
	{
		String day="Monday";
		String result="";
		String alarm="";
		result = switch(day)
		{
			//no need for break and switch returns the value
			
			case "Sunnday","Saturday" -> "9am";
			case "Monday" -> "8am";
			default -> "7am";
		};
		
		alarm = switch(day)
		{
			//no need for break
					
			case "Sunnday","Saturday": yield "9am";
			case "Monday": yield "8am";
			default: yield "7am";
		};
		
		System.out.println(result);
		System.out.println(alarm);
	}

}
