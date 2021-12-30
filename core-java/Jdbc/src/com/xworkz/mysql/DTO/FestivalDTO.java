package com.xworkz.mysql.DTO;

import java.io.Serializable;

public class FestivalDTO implements Serializable{
	private String name;
	private int date;
	private String specility;
	private int dayDuration;
	public FestivalDTO(String name, int date, String specility, int dayDuration) {
		super();
		this.name = name;
		this.date = date;
		this.specility = specility;
		this.dayDuration = dayDuration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getSpecility() {
		return specility;
	}
	public void setSpecility(String specility) {
		this.specility = specility;
	}
	public int getDayDuration() {
		return dayDuration;
	}
	public void setDayDuration(int dayDuration) {
		this.dayDuration = dayDuration;
	}
	@Override
	public String toString() {
		return "FestivalDTO [name=" + name + ", date=" + date + ", specility=" + specility + ", dayDuration="
				+ dayDuration + "]";
	}
	
}
