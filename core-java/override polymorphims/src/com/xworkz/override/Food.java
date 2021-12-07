package com.xworkz.override;

public class Food {
	private String name;
	private int price;
	private String quantity;
	private String quality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		System.out.println("invoked the tostring");
		return "raman";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashcode");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Food) {
				Food casted = (Food) obj;
				String ref = casted.getQuality();
				System.out.println("food quality :" + ref);

				String ref1 = casted.getQuantity();
				System.out.println("food quantity :" + ref1);
				if (ref.equals(getQuality()) && ref1.equals(getQuantity())) {
					System.out.println("datatype is matching...");
					return true;
				}
			}else {
				System.out.println("cant converting the datatype");
			}
		}

		return false;
	}
}
