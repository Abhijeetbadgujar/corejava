package com.xworkz.tourist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport_detailss")
public class AirportEntity {
	@Id
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_manegerName")
	private String ManegerName;
	@Column(name = "a_dailyFlight")
	private int dailyFlight;

	public AirportEntity() {
		// TODO Auto-generated constructor stub
	}

	public AirportEntity(int id, String name, String manegerName, int dailyFlight) {
		super();
		this.id = id;
		this.name = name;
		ManegerName = manegerName;
		this.dailyFlight = dailyFlight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManegerName() {
		return ManegerName;
	}

	public void setManegerName(String manegerName) {
		ManegerName = manegerName;
	}

	public int getDailyFlight() {
		return dailyFlight;
	}

	public void setDailyFlight(int dailyFlight) {
		this.dailyFlight = dailyFlight;
	}

	@Override
	public String toString() {
		return "AirportEntity [id=" + id + ", name=" + name + ", ManegerName=" + ManegerName + ", dailyFlight="
				+ dailyFlight + "]";
	}
}
