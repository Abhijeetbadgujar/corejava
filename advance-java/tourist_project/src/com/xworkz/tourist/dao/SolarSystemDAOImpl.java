package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tourist.entity.SolarSystemEntity;
import com.xworkz.tourist.util.EMFUtil;

public class SolarSystemDAOImpl implements SolarSystemDAO {
	
	public void put(SolarSystemEntity entity) {
	EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(entity);
	transaction.commit();
}
}