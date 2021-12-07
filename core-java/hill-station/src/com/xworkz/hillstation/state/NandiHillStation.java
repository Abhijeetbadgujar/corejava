package com.xworkz.hillstation.state;

public class NandiHillStation extends HillStation {

	public NandiHillStation(String name,double elevation) {
		super(name,elevation);
		System.out.println("invoked NandiHillStation no-arg const");
	}
	
	public void updateElevation(double anything)
	{
		super.elevation=anything;
		super.displayDetails();
	}
}
