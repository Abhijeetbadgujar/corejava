package com.xworkz.dp;

public class BraceletDTO {
	private int price;
	private String material;
	private String colour;
	private boolean taken;
	private boolean gifted;
	
	public BraceletDTO() {
		System.out.println("invoked the no-parameterized constructor");
	}

	public BraceletDTO(int price, String material, String colour, boolean taken, boolean gifted) {
		super();
		this.price = price;
		this.material = material;
		this.colour = colour;
		this.taken = taken;
		this.gifted = gifted;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}
}
