package com.xworkz.things;

public class Paint {
	public Paint() {
		System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in Paint"));
	}

	public Boolean colour() {
		return true;
	}

	public String shine() {
		return "LOOKING SHINE";
	}
}
