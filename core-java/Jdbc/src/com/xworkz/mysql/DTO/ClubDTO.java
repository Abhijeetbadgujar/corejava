package com.xworkz.mysql.DTO;

import java.io.Serializable;

public class ClubDTO implements Serializable{
	private int id;
	private String name;
	private int noOfBouncers;
	private int fees;
	public ClubDTO(int id, String name, int noOfBouncers, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.noOfBouncers = noOfBouncers;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNoOfBouncers() {
		return noOfBouncers;
	}
	public int getFees() {
		return fees;
	}
	
	@Override
	public String toString() {
		return "ClubDTO [id=" + id + ", name=" + name + ", noOfBouncers=" + noOfBouncers + ", fees=" + fees + "]";
	}
	
	
}
