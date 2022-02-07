package com.xworkz.things;

public class Mask {
	public Mask() {
		System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in Mask"));
	}

	public Boolean protect() {
		return true;
	}

	public String wearing() {
		return "looking purpose";
	}

}
