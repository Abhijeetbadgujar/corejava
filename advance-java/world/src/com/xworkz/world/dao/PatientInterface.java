package com.xworkz.world.dao;

import com.xworkz.world.entity.PatientEntity;

public interface PatientInterface {
	public void create(PatientEntity entity);
	public PatientEntity getById(int id);
	default void updatePatientEntity(String newbirth,int id) {
		return;
	}
	default void delete(int id) {
		
	}
	}
