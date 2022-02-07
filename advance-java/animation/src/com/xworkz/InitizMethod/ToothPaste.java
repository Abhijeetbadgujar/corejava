package com.xworkz.InitizMethod;

public class ToothPaste {

	private String company;
	private float price;
	private float offer;
	private float ml;
	private boolean saltRNot;
	
	public ToothPaste(String company,float price,float offer) {
		this.company=company;
		this.price=price;
		this.offer=offer;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getOffer() {
		return offer;
	}

	public void setOffer(float offer) {
		this.offer = offer;
	}

	public float getMl() {
		return ml;
	}

	public void setMl(float ml) {
		this.ml = ml;
		System.out.println("toothpaste:"+ml);
	}

	public boolean isSaltRNot() {
		return saltRNot;
	}

	public void setSaltRNot(boolean saltRNot) {
		this.saltRNot = saltRNot;
		System.out.println("toothpaste in that salt or not:"+saltRNot);
	}
	
}
