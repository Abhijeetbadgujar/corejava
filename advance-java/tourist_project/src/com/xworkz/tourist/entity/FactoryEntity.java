package com.xworkz.tourist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="factory_detailss")
public class FactoryEntity {
	@Id
	@Column (name="f_id")
private int id;
	@Column (name="f_name")
private String name;
	@Column (name="f_location")
private String location;
	@Column (name="f_product")
private String product;
	@Column (name="f_ceoName")
private String ceoName;
public FactoryEntity() {
	// TODO Auto-generated constructor stub
}
public FactoryEntity(int id, String name, String location, String product, String ceoName) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.product = product;
	this.ceoName = ceoName;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getCeoName() {
	return ceoName;
}
public void setCeoName(String ceoName) {
	this.ceoName = ceoName;
}
@Override
public String toString() {
	return "factory [id=" + id + ", name=" + name + ", location=" + location + ", product=" + product + ", ceoName="
			+ ceoName + "]";
}
}
