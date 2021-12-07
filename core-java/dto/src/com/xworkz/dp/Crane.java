package com.xworkz.dp;

public class Crane {
	private String name;
	private String location;
	private String colour;
	private int speed;
	private int noOfCrane;
	private float weight;
	private float length;
	
	public Crane() {
		System.out.println("invoked the no-parameterized constructor");
	}
	public Crane(String name, String location, String colour, int speed, int noOfCrane, float weight, float length) {
		super();
		this.name = name;
		this.location = location;
		this.colour = colour;
		this.speed = speed;
		this.noOfCrane = noOfCrane;
		this.weight = weight;
		this.length = length;
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
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getNoOfCrane() {
		return noOfCrane;
	}
	public void setNoOfCrane(int noOfCrane) {
		this.noOfCrane = noOfCrane;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	
}
