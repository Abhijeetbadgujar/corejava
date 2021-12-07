package com.xworkz.DTO;

public class CircusDTO {
	private String owner;
	private String duration;
	private int tiketPrice;
	private int noOfAnimals;
	private int noOfShows;
	
	public CircusDTO(String owner, int tiketPrice, int noOfAnimals, int noOfShows, String duration) {
		super();
		this.owner = owner;
		this.tiketPrice = tiketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
		this.duration = duration;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getTiketPrice() {
		return tiketPrice;
	}
	public void setTiketPrice(int tiketPrice) {
		this.tiketPrice = tiketPrice;
	}
	public int getNoOfAnimals() {
		return noOfAnimals;
	}
	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
}
