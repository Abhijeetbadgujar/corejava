package com.xworkz.methods.NameDTODAO;

public class ProductDTO {
	private String id;
	private String name;
	private String manufacture;
	private int price;
	
	public ProductDTO() {
	}

	public ProductDTO(String id, String name, String manufacture, int price) {
		super();
		this.id = id;
		this.name = name;
		this.manufacture = manufacture;
		this.price = price;
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

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
