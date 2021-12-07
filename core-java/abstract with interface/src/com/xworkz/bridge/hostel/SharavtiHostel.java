package com.xworkz.bridge.hostel;

public class SharavtiHostel implements HostelRules,OyoRules {
	
	public int inTime;
	public int age=18;
	@Override
	public int inTime() {
		this.inTime=9;
		System.out.println("Hostel inTime:"+this.inTime);
		return 10;
	}

	@Override
	public int age() {
		System.out.println("Oyo hotel age:"+age);
		return 0;
	}
	
}
