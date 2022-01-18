package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.workz.tourist.util.EMFUtil;
import com.xworkz.tourist.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO {
	
	public void save(WebsiteEntity entity) {
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		
		
	}
}
