package com.xworkz.dp;

public class Carpenter {
	String name;
	String experance;
	String degree;
	String madeThings;
	int ratting;
	int price;
	boolean trust;
	
	public Carpenter() {
		System.out.println("invoked the no-para constructor");
	}

	public Carpenter(String name, String experance, String degree, String madeThings, int ratting, int price,
			boolean trust) {
		super();
		this.name = name;
		this.experance = experance;
		this.degree = degree;
		this.madeThings = madeThings;
		this.ratting = ratting;
		this.price = price;
		this.trust = trust;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperance() {
		return experance;
	}

	public void setExperance(String experance) {
		this.experance = experance;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMadeThings() {
		return madeThings;
	}

	public void setMadeThings(String madeThings) {
		this.madeThings = madeThings;
	}

	public int getRatting() {
		return ratting;
	}

	public void setRatting(int ratting) {
		this.ratting = ratting;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isTrust() {
		return trust;
	}

	public void setTrust(boolean trust) {
		this.trust = trust;
	}
	
	
}
