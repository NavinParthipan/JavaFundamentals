package com.infy.DateTimeApi;

import java.time.LocalTime;  

public class LocalTimeExample { 
	public static void main(String[] args) {  
		LocalTime startTime = LocalTime.now();   
		LocalTime endTime = startTime.plusSeconds(1);
		int count=0;
		while(true) {
		    LocalTime current = LocalTime.now();
		    int second = current.getSecond();           // Getting the seconds components
		    if(second == endTime.getSecond()) {
		        System.out.println("Over");
		        break;
		    }
		    else {
		    	count++;
		    	System.out.println("NP");
		    }
		}
		System.out.println(count);
		System.out.println(LocalTime.now());
	}
}  
// The while loop will run for 1 second

