package com.xworkz.tourist.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.workz.tourist.util.EMFUtil;
import com.xworkz.tourist.entity.TouristEntity;

public class TouristDAOImpl implements TouristDAO {
	public void put(TouristEntity entity) {
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//TouristEntity t_Entity=entityManager.cre
		//EntityTransaction entityTransaction= entityManager.getTransaction();
		EntityTransaction tran= entityManager.getTransaction();
		tran.begin();
		entityManager.persist(entity);
		tran.commit();
		
		
	}
}
