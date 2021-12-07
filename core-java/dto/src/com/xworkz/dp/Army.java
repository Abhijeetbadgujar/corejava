package com.xworkz.dp;

public class Army {
	private String countryName;
	private String dresscode;
	private String password;
	private int noOfArmy;
	private int noOfTank;
	private int NoOfNuclearBom;
	private int aircraft;
	
	public Army() {
		System.out.println("invoked the no-parameterized constructor");
	}

	public Army(String countryName, String dresscode, String password, int noOfArmy, int noOfTank, int noOfNuclearBom,
			int aircraft) {
		super();
		this.countryName = countryName;
		this.dresscode = dresscode;
		this.password = password;
		this.noOfArmy = noOfArmy;
		this.noOfTank = noOfTank;
		NoOfNuclearBom = noOfNuclearBom;
		this.aircraft = aircraft;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDresscode() {
		return dresscode;
	}

	public void setDresscode(String dresscode) {
		this.dresscode = dresscode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNoOfArmy() {
		return noOfArmy;
	}

	public void setNoOfArmy(int noOfArmy) {
		this.noOfArmy = noOfArmy;
	}

	public int getNoOfTank() {
		return noOfTank;
	}

	public void setNoOfTank(int noOfTank) {
		this.noOfTank = noOfTank;
	}

	public int getNoOfNuclearBom() {
		return NoOfNuclearBom;
	}

	public void setNoOfNuclearBom(int noOfNuclearBom) {
		NoOfNuclearBom = noOfNuclearBom;
	}

	public int getAircraft() {
		return aircraft;
	}

	public void setAircraft(int aircraft) {
		this.aircraft = aircraft;
	}
	
	
}
