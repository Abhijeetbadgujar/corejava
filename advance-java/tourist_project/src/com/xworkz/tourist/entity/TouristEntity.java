package com.xworkz.tourist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*@Entity
@Table (name="tourist_detailss")
public class TouristEntity implements Serializable{
	@Id
	@Column (name="t_id")
private int id;
	@Column (name="t_name")
private String name;
	@Column (name="t_sealevel")
private int seaLevel;
	@Column (name="t_femousFor")
private String famousFor;
	@Column (name="t_entryFees")
private int entryFees;
	@Column (name="t_season")
private String season;
public TouristEntity() {
	// TODO Auto-generated constructor stub
}
public TouristEntity(int id, String name, int seaLevel, String famousFor, int entryFees, String season) {
	super();
	this.id = id;
	this.name = name;
	this.seaLevel = seaLevel;
	this.famousFor = famousFor;
	this.entryFees = entryFees;
	this.season = season;
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
public int getSeaLevel() {
	return seaLevel;
}
public void setSeaLevel(int seaLevel) {
	this.seaLevel = seaLevel;
}
public String getFamousFor() {
	return famousFor;
}
public void setFamousFor(String famousFor) {
	this.famousFor = famousFor;
}
public int getEntryFees() {
	return entryFees;
}
public void setEntryFees(int entryFees) {
	this.entryFees = entryFees;
}
public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}
@Override
public String toString() {
	return "TouristEntity [id=" + id + ", location=" + name + ", seaLevel=" + seaLevel + ", famousFor=" + famousFor
			+ ", entryFees=" + entryFees + ", season=" + season + "]";
}
}*/
@Entity
@Table(name = "tourist_detailss")

public class TouristEntity implements Serializable {
	@Id
	@Column(name = "t_id")
	private int id;
	@Column(name = "t_name")
	private String name;
	@Column(name = "t_sealevel")
	private int sealevel;
	@Column(name = "t_femousFor")
	private String famousFor;
	@Column(name = "t_entryFees")
	private int entryFees;
	@Column(name = "t_season")
	private String season;

	public TouristEntity() {
		System.out.println("Invoked no-arg TourEntity");
	}

	public TouristEntity(int id, String name, int sealevel, String famousFor, int entryFees, String season) {
		super();
		System.out.println("Invoked parameterized TourEntity");
		this.id = id;
		this.name = name;
		this.sealevel = sealevel;
		this.famousFor = famousFor;
		this.entryFees = entryFees;
		this.season = season;
	}

	public int gettId() {
		return id;
	}

	public void settId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSealevel() {
		return sealevel;
	}

	public void setSealevel(int sealevel) {
		this.sealevel = sealevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "TourEntity [id=" + id + ", name=" + name + ", sealevel=" + sealevel + ", famousFor=" + famousFor
				+ ", entryFees=" + entryFees + ", season=" + season + "]";
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(entryFees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((famousFor == null) ? 0 : famousFor.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + Float.floatToIntBits(sealevel);
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TourEntity other = (TourEntity) obj;
		if (Double.doubleToLongBits(entryFees) != Double.doubleToLongBits(other.entryFees))
			return false;
		if (famousFor == null) {
			if (other.famousFor != null)
				return false;
		} else if (!famousFor.equals(other.famousFor))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Float.floatToIntBits(sealevel) != Float.floatToIntBits(other.sealevel))
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (id != other.id)
			return false;
		return true;*/
	
}
