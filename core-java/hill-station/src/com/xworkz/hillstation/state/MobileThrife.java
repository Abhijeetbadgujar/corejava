package com.xworkz.hillstation.state;

public class MobileThrife extends Thrife{

	protected String nativePlace="hursul";
	
	public MobileThrife() {
		System.out.println("invoked the no-arg constructor in Mobile Thrife");
	}
	public MobileThrife(String name,String specilization,String area,int experience,int age) {
		super(name,specilization,area,experience,age);
		System.out.println("invoked the no-arg constructor in Mobile Thrife");
	}
	
	//@Override
	public String sellItem() {
		System.out.println("invoked the sellItem");
		return "rajaji nagar";
	}
	/*@Override
	public String sellItem() {
		System.out.println("invoked the sellItem");
		return "34";
	}*/
	
	/*@Override
	public void displayDetails() {
		System.out.println(this.nativePlace);
		super.displayDetails();
	}*/
	public void displayDetails() {
		System.out.println(super.age);
		System.out.println(super.area);
		System.out.println(super.experience);
		System.out.println(super.name);
		System.out.println(super.specilization);
		System.out.println(this.nativePlace);
		
	}
	
	
}
