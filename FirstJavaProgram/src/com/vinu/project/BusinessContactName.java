package com.vinu.project;

import java.util.ArrayList;
import java.util.List;


public class BusinessContactName {
	public static void main(String args[]) {
	String[] nameArr = {"James Anderson","Joe Root"};
	List<String> contactList = new ArrayList<>();
	for(String a : nameArr) {
		contactList.add(a);
	}
	for(String s:contactList) {
		System.out.println(s);
	}
	}
}
