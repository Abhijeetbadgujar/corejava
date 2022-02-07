package com.xworkz.InitizMethod;

public class Ups {

	private String company;
	private String type;
	private float weight;
	private int backUpHours;
	private float chargeHours;
	public Ups(String company, String type, float weight) {
		super();
		this.company = company;
		this.type = type;
		this.weight = weight;
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
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
		System.out.println("Ups"+weight);
	}
	public int getBackUpHours() {
		return backUpHours;
	}
	public void setBackUpHours(int backUpHours) {
		this.backUpHours = backUpHours;
		System.out.println("Ups:"+backUpHours);
	}
	public float getChargeHours() {
		return chargeHours;
	}
	public void setChargeHours(float chargeHours) {
		this.chargeHours = chargeHours;
		System.out.println("UPS:"+chargeHours);
	}
	
}
