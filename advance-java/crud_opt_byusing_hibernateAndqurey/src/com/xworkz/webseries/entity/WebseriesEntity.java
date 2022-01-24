package com.xworkz.webseries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="webseries_detailss")
public class WebseriesEntity {
	@Id
	@Column (name="w_id")
private int id;
	@Column (name="w_name")
private String name;
	@Column (name="w_season")
private int season;
	@Column (name="w_type")
private String type;
public WebseriesEntity() {
	// TODO Auto-generated constructor stub
}
public WebseriesEntity(int id, String name, int season, String type) {
	super();
	this.id = id;
	this.name = name;
	this.season = season;
	this.type = type;
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
public int getSeason() {
	return season;
}
public void setSeason(int season) {
	this.season = season;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "WebseriesEntity [id=" + id + ", name=" + name + ", season=" + season + ", type=" + type + "]";
}


}
