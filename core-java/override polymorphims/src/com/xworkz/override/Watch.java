package com.xworkz.override;

public class Watch {
	private String brand;
	private Type type;
	private int price;

	public Watch() {
		System.out.println("invoked the no-arg watch");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("invoked the tostring");
		return "Tiatan";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
		
			if (obj instanceof Watch) {
				Watch casted = (Watch) obj;
				String ref = casted.getBrand();
				System.out.println("invoked the brand name:" + ref);
				Type type=casted.getType();
				System.out.println("invoked the type name:"+type);
				if (this.brand.equals(ref) && this.type.equals(type)) {
					System.out.println("brand name is match");
					return true;
				} else {
					System.out.println("brand name is mismatch");
				}
			}
			/*
			 * else { return true; }
			 */

		} else {

			System.err.println("cant converting the another datatype");
		}
		System.err.println("the object is null");

		return false;
	}
}