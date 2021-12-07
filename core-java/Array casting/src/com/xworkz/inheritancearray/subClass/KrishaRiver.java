package com.xworkz.inheritancearray.subClass;

public class KrishaRiver extends River{
	public int noOfdames;
	
	public KrishaRiver() {
		
		this(5);
		System.out.println("invoked the no-arg constructor in krishRiver");
	}
	public KrishaRiver(int noOfdames) {
		System.out.println(super.name);
		System.out.println(super.desination);
		System.out.println(noOfdames);
	//	System.out.println("---------------------");
	}
}
