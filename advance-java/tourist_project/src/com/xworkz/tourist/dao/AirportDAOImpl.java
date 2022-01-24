package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tourist.entity.AirportEntity;
import com.xworkz.tourist.entity.MedicineEntity;
import com.xworkz.tourist.util.EMFUtil;

public class AirportDAOImpl implements AirportDAO {
	public void put(AirportEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
	}
}
