package com.xworkz.hillstation.state;

public class HillStation {

	public String name;
	public double elevation;

	public HillStation() {
		super();
		System.out.println("invoked HillStation no-arg const");
	}

	public HillStation(String name, double elevation) {
		this.elevation = elevation;
		this.name = name;
		System.out.println("invoked string,double const of HillStation");
	}
// class ref or using inheritance
	// class within packahe can access
	// ref or inheritance 
	
	protected void displayDetails() {
		System.out.println("invoked displayDetails...");
		System.out.println(this.elevation);
		System.out.println(this.name);
	}

}
