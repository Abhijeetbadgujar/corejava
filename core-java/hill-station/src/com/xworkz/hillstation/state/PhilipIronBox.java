package com.xworkz.hillstation.state;

public class PhilipIronBox extends IronBox {

	public PhilipIronBox() {
		System.out.println("invoked the no-arg constuctor in philipIronBox");
	}

	public PhilipIronBox(String brand, String type, boolean working, double minTem, double maxTem) {
		super(brand, type, working, minTem, maxTem);
		System.out.println("invoked the philipIronBox");
	}
	public void displayDetails() {
		System.out.println(super.getBrand());
		System.out.println(super.getType());
		System.out.println(super.isWorking());
		System.out.println(super.getMaxTem());
		System.out.println(super.getMinTem());
	}
	
	
}
