package com.xworkz.world.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//@ annotation is the powerful way to provide the relational table mapping.
@Entity  //marks this class as a entity bean. 
@Table (name="state_detailss")  // it is allowed to the details of the table that is used to the entity in the table
public class StateEntity implements Serializable{
	@Id  //this annotation show to primitive key 
	@Column (name="st_id")// this annotation show to details of the column.
	private int id;
	@Column (name="st_name")
	private String name;
	@Column (name="st_noOfDistrict")
	private int noOfdistract;
	@Column (name="st_capitalCity")
	private String capitalCity;
	public StateEntity() {
		// TODO Auto-generated constructor stub
	}
	public StateEntity(int id, String name, int noOfdistract, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfdistract = noOfdistract;
		this.capitalCity = capitalCity;
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
	public int getNoOfdistract() {
		return noOfdistract;
	}
	public void setNoOfdistract(int noOfdistract) {
		this.noOfdistract = noOfdistract;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfdistract=" + noOfdistract + ", capitalCity="
				+ capitalCity + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

}
