package com.xworkz.override;

public class Stadium {
	private String name;
	private String city;
	private int areaInMeter;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAreaInMeter() {
		return areaInMeter;
	}

	public void setAreaInMeter(int areaInMeter) {
		this.areaInMeter = areaInMeter;
	}

	@Override
	public String toString() {
		System.out.println("invoked the to string");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Stadium) {
				Stadium casted = (Stadium) obj;
				String ref = casted.getCity();
				if (this.city.equals(ref)) {
					System.out.println("datatype is matching...");
					return true;

				} else {
					System.err.println("cant converting the datatype");
					return false;
				}
			}
		} else {
			System.err.println("datatype is null");
			return false;
		}

		System.err.println("contaner id is not match");
		return false;
	}

}
