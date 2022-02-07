package com.xworkz.InitizMethod;

public class SolarWaterHeater {

	private int capacity;
	private String brand;
	private int price;
	private boolean coldWater;
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("solarHeater capacity:"+ capacity);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("solarHeater comapany:"+brand);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		System.out.println("solarHeater price"+price);
	}
	public boolean isColdWater() {
		return coldWater;
	}
	public void setColdWater(boolean coldWater) {
		this.coldWater = coldWater;
		System.out.println("solarHeater is giving cold water or not:"+coldWater);
	}
	
}
