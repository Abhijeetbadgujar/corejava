package com.xworkz.dp;

public class Eleveter {
	String brand;
	int noOfStier;
	String colour;
	float height;
	int capacity;
	boolean digital;
	boolean safety;
	public Eleveter() {
		System.out.println("invoked the no-para constructor");
	}
	public Eleveter(String brand, int noOfStier, String colour, float height, int capacity, boolean digital,
			boolean safety) {
		super();
		this.brand = brand;
		this.noOfStier = noOfStier;
		this.colour = colour;
		this.height = height;
		this.capacity = capacity;
		this.digital = digital;
		this.safety = safety;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNoOfStier() {
		return noOfStier;
	}
	public void setNoOfStier(int noOfStier) {
		this.noOfStier = noOfStier;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isDigital() {
		return digital;
	}
	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	public boolean isSafety() {
		return safety;
	}
	public void setSafety(boolean safety) {
		this.safety = safety;
	}
	
}
