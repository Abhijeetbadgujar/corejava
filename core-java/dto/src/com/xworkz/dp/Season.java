package com.xworkz.dp;

public class Season {
	String temperature;
	String weater;
	String seasonType;
	String duration;
	int time;
	String weatercast;
	
	public Season() {
		System.out.println("invoked by the no-parameterized constructor");
	}

	public Season(String temperature, String weater, String seasonType, String duration, int time, String weatercast) {
		super();
		this.temperature = temperature;
		this.weater = weater;
		this.seasonType = seasonType;
		this.duration = duration;
		this.time = time;
		this.weatercast = weatercast;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWeater() {
		return weater;
	}

	public void setWeater(String weater) {
		this.weater = weater;
	}

	public String getSeasonType() {
		return seasonType;
	}

	public void setSeasonType(String seasonType) {
		this.seasonType = seasonType;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getWeatercast() {
		return weatercast;
	}

	public void setWeatercast(String weatercast) {
		this.weatercast = weatercast;
	}
	
}
