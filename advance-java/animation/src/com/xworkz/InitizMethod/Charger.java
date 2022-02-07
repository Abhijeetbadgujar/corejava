package com.xworkz.InitizMethod;

public class Charger {
	
	private String brand;
	private int price;
	private String colour;
	private float volt;
	private boolean workingRNot;
	
	public Charger(String brand,int price) {
		this.brand=brand;
		this.price=price;
		System.out.println("invoked the changer");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
		System.out.println(colour);
	}

	public float getVolt() {
		return volt;
	}

	public void setVolt(float volt) {
		this.volt = volt;
		System.out.println(volt);
	}

	public boolean isWorkingRNot() {
		return workingRNot;
	}

	public void setWorkingRNot(boolean workingRNot) {
		this.workingRNot = workingRNot;
		System.out.println("changer is working or not:"+workingRNot);
	}
	
}
