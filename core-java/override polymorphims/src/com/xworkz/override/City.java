package com.xworkz.override;

public class City {
	private String name;
	private String state;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		System.out.println("invoked the tostring");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked the hash code");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof City) {
				City casted = (City) obj;
				String ref = casted.getName();
				System.out.println("the city name:" + ref);
				String ref1 = casted.getCountry();
				System.out.println("the country name:" + ref1);
				if (this.name.equals(ref) && ref1.equals(getCountry())) {
					System.out.println("datatype is matching...");
					return true;
				
				}
				else {
					System.err.println("datatype is not match");
					
				}
			}else {
				System.err.println("obj is null");
				return false;
			}
			
		}else {
			System.err.println(" datatype is cant change");
			return false;
		}
		
		return false;
		
	}
}
