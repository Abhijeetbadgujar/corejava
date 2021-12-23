package com.xworkz.methods.operational;

public class PresidentDTO {
	private String id;
	private String name;
	int tenure;
	private String countryName;
	
	public PresidentDTO(String id, String name, int tenure, String countryName) {
		super();
		this.id = id;
		this.name = name;
		this.tenure = tenure;
		this.countryName = countryName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + ", tenure=" + tenure + ", countryName=" + countryName
				+ "]";
	}


	
	
	
}
