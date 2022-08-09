package com.infy.DateTimeApi;

import java.time.LocalDate;
import java.time.Period;

class EmployeeService {
    public static long calculateLOPs(LocalDate startDateLOP, LocalDate endDateLOP) {
        Period period = Period.between(startDateLOP, endDateLOP);
        int lops = period.getDays();
        return lops + 1;
    }
    // Other fields and methods
}


public class PeriodExample {
	public static void main(String args[]) {
		LocalDate startLop = LocalDate.parse("2003-02-17");
		LocalDate endLop = LocalDate.parse("2003-02-20");
		System.out.println(EmployeeService.calculateLOPs(startLop, endLop));
	}
}
