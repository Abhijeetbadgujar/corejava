package com.xworkz.world.dao;

import com.xworkz.world.entity.CityEntity;
import com.xworkz.world.entity.CountryEntity;

public interface CityInterface {
	public void create(CityEntity entity);
	public CityEntity getById(int Id);

	default void updateCity_name(String newCity, int id) {
		return;
	}
	default void delete(int Id) {
	}
}
