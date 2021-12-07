package com.xworkz.crudoperation;

public class BusRouteDTO {
	String id;
	String busPoint;
	String destination;
	String driverName;
	
	public BusRouteDTO(String id, String busPoint, String destination, String driverName) {
		super();
		this.id = id;
		this.busPoint = busPoint;
		this.destination = destination;
		this.driverName = driverName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusPoint() {
		return busPoint;
	}

	public void setBusPoint(String busPoint) {
		this.busPoint = busPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
}
