package com.xworkz.extend.shop;

public class SugarFactory extends Factory{
	
	private String name;
	private int since;
	
	public SugarFactory() {
		System.out.println("invoked the Sugar Factory");
	}

	public SugarFactory( int since) {
		//super();
System.out.println("Invoked parameterized sugar factory constr");
		this.since = since;
		System.out.println(this.since);
	}
	
}
