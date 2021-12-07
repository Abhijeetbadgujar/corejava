package com.xworkz.DTO;

public class TimerDTO {
	private String working;
	private int correctTime;
	private String digital;
	private String belt;
	private String brand;

	public TimerDTO() {

	}

	public TimerDTO(String working, int correctTime, String digital, String belt, String brand) {
		super();
		this.working = working;
		this.correctTime = correctTime;
		this.digital = digital;
		this.belt = belt;
		this.brand = brand;
	}

	public String getWorking() {
		return working;
	}

	public void setWorking(String working) {
		this.working = working;
	}

	public int getCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(int correctTime) {
		this.correctTime = correctTime;
	}

	public String getDigital() {
		return digital;
	}

	public void setDigital(String digital) {
		this.digital = digital;
	}

	public String getBelt() {
		return belt;
	}

	public void setBelt(String belt) {
		this.belt = belt;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}