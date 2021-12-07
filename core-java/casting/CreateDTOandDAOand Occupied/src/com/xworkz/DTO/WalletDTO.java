package com.xworkz.DTO;

public class WalletDTO {
	
	String company;
	String material;
	int totalCompartments;
	int price;
	int compartment;
	public WalletDTO(String company, String material, int totalCompartments, int price, int compartment) {
		super();
		this.company = company;
		this.material = material;
		this.totalCompartments = totalCompartments;
		this.price = price;
		this.compartment = compartment;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getTotalCompartments() {
		return totalCompartments;
	}
	public void setTotalCompartments(int totalCompartments) {
		this.totalCompartments = totalCompartments;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCompartment() {
		return compartment;
	}
	public void setCompartment(int compartment) {
		this.compartment = compartment;
	}
}
