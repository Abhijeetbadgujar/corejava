package com.xworkz.world.dao;

import com.xworkz.world.entity.CountryEntity;
import com.xworkz.world.entity.StateEntity;

public interface CountryInterface {
	public void create(CountryEntity countryEntity);
	public CountryEntity getById(int Id);

	default void updateCity_name(String newCity, int id) {
		return;
	}
	default void delete(int Id) {
	}
}
