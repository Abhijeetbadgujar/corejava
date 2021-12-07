package com.xworkz.bridge.VotingRules.DAO;

public class CartDTO {
	String name;
	int quantity;
	float price;
	String items;
	
	public CartDTO() {
		System.out.println("CartDTO constructor which is no-arg ");
	}

	public CartDTO(String name, int quantity, float price, String items) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}
	
}
