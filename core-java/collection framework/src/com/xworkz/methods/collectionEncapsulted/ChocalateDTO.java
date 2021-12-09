package com.xworkz.methods.collectionEncapsulted;

public class ChocalateDTO {
	private String name,colour,quality;
	private int quantity;
	public ChocalateDTO(String name, String colour, String quality, int quantity) {
		super();
		this.name = name;
		this.colour = colour;
		this.quality = quality;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ChocalateDTO [name=" + name + ", colour=" + colour + ", quality=" + quality + ", quantity=" + quantity
				+ "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ChocalateDTO) {
				ChocalateDTO casted=(ChocalateDTO)obj;
				if(this.name.equals(casted.name) && this.colour.equals(casted.colour)){
					return true;
				}
			}
		}
		return false;
	}
}
