package com.xworkz.methods.praticesCollection;

public class Palace {
	private String name,location,colour,owner;
	private int area;
	public Palace(String name, String location, String colour, String owner, int area) {
		super();
		this.name = name;
		this.location = location;
		this.colour = colour;
		this.owner = owner;
		this.area = area;
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
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "palace [name=" + name + ", location=" + location + ", colour=" + colour + ", owner=" + owner + ", area="
				+ area + "]";
	}
}
