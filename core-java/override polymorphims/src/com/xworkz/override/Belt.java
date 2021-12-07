package com.xworkz.override;

public class Belt {
	private int price;
	private String material;
	private int size;
	private String gender;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		System.out.println("invoked the tostring");
		return super.toString();
	}
	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Belt) {
			Belt casted=(Belt)obj;
			String ref=casted.getMaterial();
			System.out.println("the belt materials :"+ref);
			if(this.material.equals(ref)) {
				System.out.println("datatype is matching...");
				return true;
			}
			else {
				System.err.println("cant converting to another datatype");
				return false;
			}
		}
	return false;
	}
}
