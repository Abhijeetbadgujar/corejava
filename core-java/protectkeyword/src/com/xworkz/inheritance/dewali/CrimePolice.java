package com.xworkz.inheritance.dewali;

import com.xworkz.inheritance.Police;

public class CrimePolice extends Police {

	public CrimePolice() {
		super();
		System.out.println("invoked the no-arg constructor in crime police");
		System.out.println(super.name);
		System.out.println(super.designation);
	}
	public void testMethod() {
		System.out.println("invoked testmethod from crime Police");
		super.displayDetails();
	}
}
