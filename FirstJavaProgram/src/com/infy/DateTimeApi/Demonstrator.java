package com.infy.DateTimeApi;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class Demonstrator
{
	public static long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
        SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
        Date start = formatt.parse(startDateLOP);
        Date end = formatt.parse(endDateLOP);
        long diff = end.getTime() - start.getTime();
        long lops = diff / (24 * 60 * 60 * 1000);
        return lops + 1;
    }
	
    public static void main (String[] args) {
        //ZonedDateTime is used to change the time according to zones
        System.out.println("*****ZonedDateTime******");
        System.out.println("ZonedDateTime Now: "+ZonedDateTime.now());                              
        System.out.println("ZonedDateTime Europe: "+ZonedDateTime.now(ZoneId.of("Europe/London")));
        
        //Period 
        System.out.println();
        System.out.println("*****Period*****");
        LocalDate present = LocalDate.now();
        LocalDate later = present.plusDays(3);
        Period period = Period.between(present, later);
        int lops = period.getDays();
        System.out.println("Difference in days: "+lops);
        
        //ChronoUnit
        System.out.println();
        System.out.println("*****ChronoUnit*****");
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: "+today);
        LocalDate after = today.plus(10,ChronoUnit.MONTHS);
        System.out.println("Date after 10 month: "+after);
        
        //DateTimeFormatter
        System.out.println();
        System.out.println("*****DateTimeFormatter*****");
        LocalDate paySlipDate = LocalDate.now();
        System.out.println(paySlipDate);                                             // Output: Current Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(paySlipDate.format(formatter));                           // Output: Current Date

    }
}
