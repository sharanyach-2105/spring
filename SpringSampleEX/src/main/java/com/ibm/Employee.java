package com.ibm;

public class Employee {
	
	private String name;
	
	public String getName()  {
		return name;
	}

	public void setName(String name)  {
		this.name = name;
	}
	public void display() {
		System.out.println("Name of the Employee: " +name);
	}
}
