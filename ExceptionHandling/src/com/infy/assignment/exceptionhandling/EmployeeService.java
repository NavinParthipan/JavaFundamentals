package com.infy.assignment.exceptionhandling;

public class EmployeeService {
	public void checkEmployeeSalary(Employee emp) throws EmpSalaryException{
	     try {
	    	 if(emp.getEmpSalary()<1000)
	    	 {
	    		 throw new EmpSalaryException("Check salary");
	    	 }
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("Check salary for "+emp.getEmpName());
	     }
	}
	
    public static void main(String[] args)throws Exception  {
		Employee e1 = new Employee("Joe Smith",20,5345);
		Employee e2 = new Employee("Lewis Jane",21,1345);
		Employee e3 = new Employee("Larry Page",22,245);
		Employee e4 = new Employee("Smith James",23,945);
		Employee e5 = new Employee("Elvis George",25,1425);
		EmployeeService empser=new EmployeeService();
		Employee[] emparray={e1,e2,e3,e4,e5};
		for (Employee employee : emparray){
			//call check employee with appropriate exception handling code
			empser.checkEmployeeSalary(employee);
 
		}
	}
 
}
