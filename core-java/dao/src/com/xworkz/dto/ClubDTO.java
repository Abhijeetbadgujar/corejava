package com.xworkz.dto;

public class ClubDTO {

	private int noOfPeople;
	private int noOfBottle;
	private int rating;
	private int entryPrice;
	private int onOfStaff;

	public ClubDTO() {
		super();
		this.noOfPeople = noOfPeople;
		this.noOfBottle = noOfBottle;
		this.rating = rating;
		this.entryPrice = entryPrice;
		this.onOfStaff = onOfStaff;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public int getNoOfBottle() {
		return noOfBottle;
	}

	public void setNoOfBottle(int noOfBottle) {
		this.noOfBottle = noOfBottle;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(int entryPrice) {
		this.entryPrice = entryPrice;
	}

	public int getOnOfStaff() {
		return onOfStaff;
	}

	public void setOnOfStaff(int onOfStaff) {
		this.onOfStaff = onOfStaff;
	}

}
