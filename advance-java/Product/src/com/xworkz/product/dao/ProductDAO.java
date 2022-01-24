package com.xworkz.product.dao;

import java.util.List;

import com.xworkz.product.entity.ProductEntity;

public interface ProductDAO {
	
	public void save(ProductEntity  productEntity);
	
	public void saveAll(List<ProductEntity> productEntity);
	
	List<ProductEntity> getAll();
	
	List<Integer> getBypriceGreaterThan(Integer price);

	List<Integer> getBypriceLessThan(Integer price);

	ProductEntity getByNameAndId(String name, int id);
	
	List<String> getTotalName();
	
	int getMaxPrice();
	
	int getTotalPrice();
	
	String getByNamelike(String name);

	
}
