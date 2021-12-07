package com.xworkz.crudoperation;

public class AirportDTO {
	String planeName;
	String location;
	String type;
	String countryName;
	
	public AirportDTO(String planeName, String location, String type, String countryName) {
		super();
		this.planeName = planeName;
		this.location = location;
		this.type = type;
		this.countryName = countryName;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
