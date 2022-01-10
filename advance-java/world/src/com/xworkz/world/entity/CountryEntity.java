package com.xworkz.world.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "country_detailss")
public class CountryEntity implements Serializable {
	@Id
	@Column (name="cty_id")
	private int cty_id;
	@Column (name="cty_name")
	private String cty_name;
	@Column (name="cty_continent")
	private String cty_continent;
	@Column (name="cty_population")
	private long cty_population;
	public CountryEntity() {
		// TODO Auto-generated constructor stub
	}

	public CountryEntity(int id, String name, String continent, long population) {
		super();
		this.cty_id = id;
		this.cty_name = name;
		this.cty_continent = continent;
		this.cty_population = population;
	}

	public int getId() {
		return cty_id;
	}

	public void setId(int id) {
		this.cty_id = id;
	}

	public String getName() {
		return cty_name;
	}

	public void setName(String name) {
		this.cty_name = name;
	}

	public String getContinent() {
		return cty_continent;
	}

	public void setContinent(String continent) {
		this.cty_continent = continent;
	}

	public long getPopulation() {
		return cty_population;
	}

	public void setPopulation(long population) {
		this.cty_population = population;
	}

	@Override
	public String toString() {
		return "CountryEntity [id=" + cty_id + ", name=" + cty_name + ", continent=" + cty_continent + ", population=" + cty_population
				+ "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	
}

