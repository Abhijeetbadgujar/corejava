package com.xworkz.dp;

public class Parks {
	String name;
	String location;
	String price;
	int noOfFlower;
	float area;
	public Parks() {
	System.out.println("invoked by the non-parameterized constructor");
	}
	public Parks(String name, String location, String price, int noOfFlower, float area) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.noOfFlower = noOfFlower;
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getNoOfFlower() {
		return noOfFlower;
	}
	public void setNoOfFlower(int noOfFlower) {
		this.noOfFlower = noOfFlower;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
}
