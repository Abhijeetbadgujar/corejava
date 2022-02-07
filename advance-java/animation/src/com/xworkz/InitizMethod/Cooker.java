package com.xworkz.InitizMethod;

public class Cooker {

	private String company;
	private float weight;
	private String colour;
	private float liters;
	private float wireLength;
	private String customer;
	public Cooker(String company, float weight, String colour) {
		super();
		this.company = company;
		this.weight = weight;
		this.colour = colour;
		System.out.println(company);
		System.out.println(weight);
		System.out.println(colour);
	}
	
	public float getLiters() {
		return liters;
	}
	public void setLiters(float liters) {
		this.liters = liters;
		System.out.println(liters);
	}
	public float getWireLength() {
		return wireLength;
	}
	public void setWireLength(float wireLength) {
		this.wireLength = wireLength;
		System.out.println(wireLength);
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
		System.out.println(customer);
	}
}
