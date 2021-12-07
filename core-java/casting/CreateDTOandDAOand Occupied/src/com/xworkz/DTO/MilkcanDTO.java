package com.xworkz.DTO;

public class MilkcanDTO {
	
	int quality;
	String shape;	
	String colour;
	int price;
	public MilkcanDTO(int quality, String shape, int quantity, String colour, int price) {
		super();
		this.quality = quality;
		this.shape = shape;
		this.colour = colour;
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
