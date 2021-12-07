package com.xworkz.dto;

public class CameraDTO {

	private String company;
	private String type;
	private int pixel;
	private int cost;
	private String batteryCapacity;
	private float weight;
	private String currentSeason;
	
	public CameraDTO() {
		System.out.println("invoked the non-parameterized constructor");
	}

	public CameraDTO(String company, String type, int pixel, int cost, String batteryCapacity, float weight,
			String currentSeason) {
		super();
		this.company = company;
		this.type = type;
		this.pixel = pixel;
		this.cost = cost;
		this.batteryCapacity = batteryCapacity;
		this.weight = weight;
		this.currentSeason = currentSeason;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(String currentSeason) {
		this.currentSeason = currentSeason;
	}


}
