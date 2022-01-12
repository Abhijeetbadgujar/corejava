package com.xworkz.tourist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
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
}
