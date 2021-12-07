package com.xworkz.inheritance;

import com.xworkz.inheritance.*;

public class TrafficPolice extends Police{
	
	TrafficPolice(){

		System.out.println("invoked the no-arg constructor in trafic police");
		System.out.println(super.name);
		System.out.println(designation);
		System.out.println(super.exp);
		System.out.println(noOfStars);
		System.out.println(super.dept);
	}
	public void testMethod() {
		System.out.println("invoked testmethod from traffic Police");
		super.displayDetails();
	}
}
