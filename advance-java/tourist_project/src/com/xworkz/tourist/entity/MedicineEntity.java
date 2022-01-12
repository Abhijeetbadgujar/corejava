package com.xworkz.tourist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_detailss")
public class MedicineEntity {
	@Id
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_type")
	private String type;
	@Column(name = "m_price")
	private int price;
public MedicineEntity() {
	// TODO Auto-generated constructor stub
}
public MedicineEntity(int id, String name, String type, int price) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.price = price;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "MedicineEntity [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
}
}
