package com.xworkz.inheritance;

public class Police {
	public String name="pappu";
	protected String designation="compounder";
	float exp;
	PoliceDept dept;
	int noOfStars;
	
	protected Police() {
			System.out.println("invoked the police no-arg constructor");
	}
	protected void displayDetails() {
		System.out.println("invoked the displayDetails from police");
	}
	
}
