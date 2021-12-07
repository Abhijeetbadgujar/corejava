package com.xworkz.override;

public class Shoe {
	private String brand;
	private int size;
	private String colour;
	private String gender;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
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
		return "red";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Shoe) {
				Shoe created = (Shoe) obj;
				String ref = created.getColour();
				System.out.println("Shoe colour :" + ref);
				if(this.colour.equals(ref)) {
					System.out.println("datatype is match...");
					return true;
				}

			}
			else {
				System.err.println("cant converting the datatype");
			}
		}

		return false;
	}
}
