package com.xworkz.things;

public class Steamer {
public Steamer() {
	System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in steamer"));
}

public Boolean heat() {
	return false;
}

public String heat1() {
	return "clean to face dust";
}

}
