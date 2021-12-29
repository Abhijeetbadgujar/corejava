package com.xworkz.methods.praticesCollection;

public class Actors {
	private String name,gender,country,colour;
	private int noOfMovies;
	public Actors(String name, String gender, String country, String colour, int noOfMovies) {
		super();
		this.name = name;
		this.gender = gender;
		this.country = country;
		this.colour = colour;
		this.noOfMovies = noOfMovies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNoOfMovies() {
		return noOfMovies;
	}
	public void setNoOfMovies(int noOfMovies) {
		this.noOfMovies = noOfMovies;
	}
	@Override
	public String toString() {
		return "Actors [name=" + name + ", gender=" + gender + ", country=" + country + ", colour=" + colour
				+ ", noOfMovies=" + noOfMovies + "]";
	}
	
}
