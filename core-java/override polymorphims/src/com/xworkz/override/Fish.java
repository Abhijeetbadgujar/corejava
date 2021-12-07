package com.xworkz.override;

public class Fish {
	private String name;
	private FishType type;
	private int price;
	private String colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FishType getType() {
		return type;
	}
	public void setType(FishType type) {
		this.type = type;
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
	}
	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}
	@Override
	public String toString() {
		System.out.println("invoked the toString");
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
		if(obj instanceof Fish) {
		Fish casted=(Fish)obj;
		String ref=casted.getName();
		System.out.println("Fish name is:"+ref);
		
		String ref1=casted.getColour();
		System.out.println("Fish colour is:"+ref1);
		if(this.name.equals(ref) && this.colour.equals(ref1)) {
			System.out.println("datatype is matching...");
			return true;
		}
		}
		}
		else {
			System.out.println("cant converting the datatype");
		}
		return false;
	}
}
