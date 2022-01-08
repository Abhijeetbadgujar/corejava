package com.xworkz.world.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="city_detailss")
public class CityEntity implements Serializable{
	@Id
	@Column (name="ct_id")
	private int id;
	@Column (name="ct_name")
	private String name;
	@Column (name="ct_coronaZone")
	private String coronaZone;
	@Column (name="ct_famousFor")
	private String famousFor;
	@Column (name="ct_population")
	private long population;
	
	public CityEntity(int id, String name, String coronaZone, String famousFor, long population) {
		super();
		this.id = id;
		this.name = name;
		this.coronaZone = coronaZone;
		this.famousFor = famousFor;
		this.population = population;
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
	public String getCoronaZone() {
		return coronaZone;
	}
	public void setCoronaZone(String coronaZone) {
		this.coronaZone = coronaZone;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "CityEntity [id=" + id + ", name=" + name + ", coronaZone=" + coronaZone + ", famousFor=" + famousFor
				+ ", population=" + population + "]";
	}
}
