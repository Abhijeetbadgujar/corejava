package com.xworkz.override;

public class Bag {
	private int price;
	private ColourBag colour;
	private int sections;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ColourBag getColour() {
		return colour;
	}
	public void setColour(ColourBag colour) {
		this.colour = colour;
	}
	public int getSections() {
		return sections;
	}
	public void setSections(int sections) {
		this.sections = sections;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked the toString");
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Bag) {
				Bag casted=(Bag)obj;
				ColourBag ref=casted.getColour();
				System.out.println("invoked bag price:"+ref);
				if(this.colour.RED.equals(ref) ) {
					System.out.println("match the datatype...");
					return true;
				}
			}else {
				System.err.println("mismatch the datatype");
				return false;
			}
		}
	System.err.println("obj is null");
	return false;
	}
}
