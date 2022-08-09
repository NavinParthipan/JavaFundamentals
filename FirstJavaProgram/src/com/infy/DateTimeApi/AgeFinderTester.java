package com.infy.DateTimeApi;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
class AgeFinder{
	LocalDate today = LocalDate.now();
	
	public int getAge(LocalDate dateOfBirth) {
		return today.compareTo(dateOfBirth);
	}
	
	public LocalDate getDateAfterNDays(int noOfDays) {
		return today.plusDays(noOfDays);
	}
	
	public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		today = today.plusYears(year);
		today = today.plusMonths(month);
		today = today.plusDays(day);
		return today;
	}
}

class AgeFinderCalendar{
	Calendar cal = Calendar.getInstance();
	
	public int getAgee(Calendar dateOfBirth) {
		return cal.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
	}
	
	public Date getDateAfterNDayss(int noOfDays) {
		cal.add(Calendar.DATE,5);
		return cal.getTime();
	}
	
	public Date getDateAfterXYearYMonthZDayss(int year, int month, int day) {
		cal.add(Calendar.YEAR,year);
		cal.add(Calendar.MONTH,month);
		cal.add(Calendar.DATE,day);
		return cal.getTime();
	}
	
}


public class AgeFinderTester {

	public static void main(String[] args) {
		AgeFinder obj1 = new AgeFinder();
		AgeFinderCalendar obj2 = new AgeFinderCalendar();
		
		
		LocalDate dob = LocalDate.parse("2022-02-17");
		Calendar dobb = (Calendar) Calendar.getInstance();
		dobb.set(2003, 02, 17);

		System.out.println("Your age is : "+obj1.getAge(dob)+" years");
		System.out.println("Your age is : "+obj2.getAgee(dobb)+" years");
		
		int noOfDays=15;
		System.out.println("The date after "+noOfDays+" is : "+obj1.getDateAfterNDays(noOfDays));
		System.out.println("The date after "+noOfDays+" is : "+obj2.getDateAfterNDayss(noOfDays));
		
		int year=1;
		int month=2;
		int days=3;
		System.out.println("The date after "+year+" year, "+month+" months and "+days+" days is: "+obj1.getDateAfterXYearYMonthZDays(year, month, days));
		System.out.println("The date after "+year+" year, "+month+" months and "+days+" days is: "+obj2.getDateAfterXYearYMonthZDayss(year, month, days));
		
	}

}
