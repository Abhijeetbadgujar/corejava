package com.xworkz.dto;

public class BucketDTO {
	private String colour;
	private String company;
	private int size;
	private int price;
	private int quantity;
	private float weight;
	
	public BucketDTO() {
		System.out.println("invoked the no-argument constructor");
	}
	

	public BucketDTO(String colour, String company, int size, int price, int quantity, float weight) {
		super();
		this.colour = colour;
		this.company = company;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}


	public void save(BucketDTO bucket1) {
		// TODO Auto-generated method stub
		
	}


	public void update(int i, Object object) {
		// TODO Auto-generated method stub
		
	}


	public void delete(int i) {
		// TODO Auto-generated method stub
		
	}
	
	public BucketDTO[] getbucKet() {
		return getbucKet();
	}
	
	
}
