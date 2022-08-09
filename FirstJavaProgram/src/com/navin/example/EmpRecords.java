package com.navin.example;

public class EmpRecords {

	public static void main(String[] args) {
		PermanentEmployee permanentEmployee=new PermanentEmployee();
		ContractEmployee contractEmployee=new ContractEmployee();
		
		permanentEmployee.setName("Anil");
		permanentEmployee.setEmpId(101);
		permanentEmployee.setBasicPay(10000);
		permanentEmployee.setHra(1500);
		permanentEmployee.setExperience(3);
		permanentEmployee.calculateSalary();
		
		contractEmployee.setName("Ankit");
		contractEmployee.setEmpId(102);
		contractEmployee.setWages(500);
		contractEmployee.setHours(10);
		contractEmployee.calculateSalary();
		
	}

}
