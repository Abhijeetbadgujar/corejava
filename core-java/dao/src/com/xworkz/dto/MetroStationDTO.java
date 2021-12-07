package com.xworkz.dto;

public class MetroStationDTO {

	private String name;
	private Route route;
	private int elevator;
	private String openTime;
	private String closeTime;
	
	
	public MetroStationDTO(String name, Route route, int elevator, String openTime, String closeTime) {
		super();
		this.name = name;
		this.route = route;
		this.elevator = elevator;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	public MetroStationDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public int getElevator() {
		return elevator;
	}
	public void setElevator(int elevator) {
		this.elevator = elevator;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	
	
	
	
}
