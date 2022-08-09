package com.vinu.project;

public class Email {

	public static void main(String[] args) {
		String email = "";
		try {
			if(!email.isEmpty()) {
				System.out.println("email");
			}
			else {
				System.out.println("a");
			}
		}
		catch(NullPointerException a)
		{
			System.out.println("null print");
		}

	}

}
