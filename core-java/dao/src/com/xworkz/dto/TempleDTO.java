package com.xworkz.dto;

public class TempleDTO {
	private String name;
	private String location;
	private String mainGod;
	private String prasada;
	private int openTime;
	public TempleDTO(String name, String location, String mainGod, String prasada, int openTime) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.prasada = prasada;
		this.openTime = openTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMainGod() {
		return mainGod;
	}
	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}
	public String getPrasada() {
		return prasada;
	}
	public void setPrasada(String prasada) {
		this.prasada = prasada;
	}
	public int getOpenTime() {
		return openTime;
	}
	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}
	public TempleDTO[] gettempleDTO() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
