package com.xworkz.override;

//import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.HeaderTokenizer;

public class Headset {
	private String brand;
	private TypeHeadset type;
	private int battery;
	private int warrenty;

	public Headset() {
		System.out.println("invoked the no-arg constructor in Headset");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public TypeHeadset getType() {
		return type;
	}

	public void setType(TypeHeadset type) {
		this.type = type;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}

	@Override
	public String toString() {
		System.out.println("invoked the toString ");
		return "Tata";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Headset) {
				Headset casted = (Headset) obj;
				String ref = casted.getBrand();
				System.out.println("converting the datatype to String :" + ref);
				if (this.brand.equals(ref)) {
					System.out.println("datatype is match");
					return true;
				} else {
					System.err.println("datatype is not match");
				}
			} else {
				System.err.println("cant converting datatype ");
				return false;
			}
		} else {
			System.err.println("obj is not null");

		}
		return false;
	}
}
