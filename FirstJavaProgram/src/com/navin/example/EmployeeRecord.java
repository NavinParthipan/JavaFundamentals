package com.navin.example;

public class EmployeeRecord {
	public double AvgSalary(double salaryArr[]) {
		double totalSalary = 0;
		for (double i : salaryArr) {
			totalSalary += i;
		}
		double avg_salary = totalSalary / salaryArr.length;
		return avg_salary;
	}

	public static void main(String args[]) {
		double salary[] = new double[] { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };

		EmployeeRecord obj1 = new EmployeeRecord();
		double avgSalary = obj1.AvgSalary(salary);

		System.out.println("The average salary of the employee is :" + avgSalary);

		int countOfSalaryGreaterThanAvg = 0;
		int countOfSalaryLessThanAverage = 0;
		for (double i : salary) {
			if (i > avgSalary) {
				countOfSalaryGreaterThanAvg++;
			} else if (i < avgSalary) {
				countOfSalaryLessThanAverage++;
			} else {
				continue;
			}
		}
		System.out.println(
				"The number of employees having salary greater than average is: " + countOfSalaryGreaterThanAvg);
		System.out.println(
				"The number of employees having salary lesser than average is: " + countOfSalaryLessThanAverage);

	}
}
