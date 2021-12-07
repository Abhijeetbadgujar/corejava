package com.xworkz.override;

public class Tyre {
	private String brand;
	private TyreType type;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public TyreType getType() {
		return type;
	}
	public void setType(TyreType type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		System.out.println("invoked the tostring");
		return super.toString();
	}
	@Override
	public int hashCode() {
		System.out.println("Invoked the hashCode");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Tyre) {
				Tyre casted=(Tyre)obj;
				TyreType ref=casted.getType();
				System.out.println("tyre type :"+ref);
				if(this.type.RADIAL.equals(ref)) {
					System.out.println("datatype is match...");
					return true;
				}
			}
		}
		return false;
	}
}
