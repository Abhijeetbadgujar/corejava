package com.xworkz.things;

public class Oximeter {
	public Oximeter() {
		System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in oximter"));
	}

	public Boolean pulse() {
		return true;
	}

	public String display() {
		return "quick device that displays the results";
	}

}
