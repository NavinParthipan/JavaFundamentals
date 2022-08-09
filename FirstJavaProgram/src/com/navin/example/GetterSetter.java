package com.navin.example;

public class GetterSetter {
	public static void main(String args[]) {
		
		Student obj1 = new Student();
		obj1.setStudentId(100);
		obj1.setName(null);
		obj1.setResidentialStatus('H');
		obj1.setQualifyingExamMarks(35.333f);
		
		int id = obj1.getStudentId();
		String namee;
		try {
			if(!obj1.getName().isEmpty()) {
				namee=obj1.getName();
			}
			else {
				namee="\"\"";
			}
		}
		catch(NullPointerException e) {
			obj1.setName("\"\"");
			namee = obj1.getName();
		}
		char res = obj1.getResidentialStatus();
		float qfm = obj1.getQualifyingExamMarks();
		
		System.out.println("Your id:" + id);
		
		System.out.println("Name :" + namee);
		
		System.out.println("You are :" + res);
		
		System.out.println("Qualifying marks:"+qfm);
	}

}
