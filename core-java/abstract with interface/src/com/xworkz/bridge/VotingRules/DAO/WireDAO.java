package com.xworkz.bridge.VotingRules.DAO;

public class WireDAO {
	String brand;
	int length;
	float weight;
	int price;

	public WireDAO(String brand, int length, float weight, int price) {
		super();
		this.brand = brand;
		this.length = length;
		this.weight = weight;
		this.price = price;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
