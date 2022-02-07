package com.xworkz.things;

public class Purifier {
	public Purifier() {
		System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in purifier"));
	}
	public Boolean purify() {
		System.out.println("invoked the purify constructor");
		return true;
	}
	public String purify1() {
		return "water";
	}
}
