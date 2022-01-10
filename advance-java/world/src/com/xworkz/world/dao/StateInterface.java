package com.xworkz.world.dao;

import com.xworkz.world.entity.StateEntity;

public interface StateInterface {
	public void create(StateEntity entity);

	public StateEntity getById(int Id);

	default void updateCapitalCity(String newCity, int id) {
		return;
	}
	default void delete(int Id) {
	}

}
