package com.xworkz.airport.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.airport.util.EMFUtil;

public class AirportDaoImpl implements AirportDAO{

	@Override
	public void save(AirportEntity entity) {
		
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		
	}

}
