package com.xworkz.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="product_detailss")
@NamedQueries ({@NamedQuery(name = "getAll",query = "select product from ProductEntity product"),
	@NamedQuery(name = "getBypriceGreaterThan", query = "select product.price from ProductEntity product where product.price >:cutoffPrice"),
	@NamedQuery(name = "getBypriceLessThan", query = "select product.price from ProductEntity product where product.price <:cutofPrice"),
	@NamedQuery(name = "getByNameAndId", query = "select product from ProductEntity as product where product.name=:setname and product.id=:id"),
	@NamedQuery(name = "getTotalName", query = "select product.name from ProductEntity as product"),
	@NamedQuery(name = "getMaxPrice", query = "select max(product.price) from ProductEntity as product"),
	@NamedQuery(name = "getTotalPrice", query = "select sum(product.price) from ProductEntity as product"),





})
public class ProductEntity  implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="p_id")
	private int id;
	@Column (name="p_name")
	private String name;
	@Column (name="p_quantity")
	private int quantity;
	@Column (name="p_brand")
	private String brand;
	@Column (name="p_price")
	private int price;
	@Column (name="p_rating")
	private int rating;
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}
	public ProductEntity( String name, int quantity, String brand, int price, int rating) {
		super();
		//this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", quantity=" + quantity + ", brand=" + brand + ", price="
				+ price + ", rating=" + rating + "]";
	}
}
