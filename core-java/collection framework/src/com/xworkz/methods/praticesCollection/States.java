package com.xworkz.methods.praticesCollection;

public class States {
	private String sName,capital;
	private int population,noOfCities;
	private boolean metro;
	public States(String sName, String capital, int population, int noOfCities, boolean metro) {
		super();
		this.sName = sName;
		this.capital = capital;
		this.population = population;
		this.noOfCities = noOfCities;
		this.metro = metro;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getNoOfCities() {
		return noOfCities;
	}
	public void setNoOfCities(int noOfCities) {
		this.noOfCities = noOfCities;
	}
	public boolean isMetro() {
		return metro;
	}
	public void setMetro(boolean metro) {
		this.metro = metro;
	}
	@Override
	public String toString() {
		return "States [sName=" + sName + ", capital=" + capital + ", population=" + population + ", noOfCities="
				+ noOfCities + ", metro=" + metro + "]";
	}
	
}
