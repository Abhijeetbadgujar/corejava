package com.xworkz.things;

public class Simcard {

	public Simcard() {
		System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in simcard"));
	}
	public String calling() {
		System.out.println("invoked the method by using spring");
		return "Please call me";
		
	}
}
