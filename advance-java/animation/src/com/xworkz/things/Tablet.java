package com.xworkz.things;


public class Tablet {
public Tablet() {
	System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in tablet"));
}

public Boolean recover() {
	return true;
}

public String recover1() {
	return "parasitemol";
}

public Integer recover3() {
	return 34;
}

}
