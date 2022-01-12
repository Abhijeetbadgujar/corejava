package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.workz.tourist.util.EMFUtil;
import com.xworkz.tourist.entity.SugarCaneEntity;

public class SugarCaneDAOImpl implements SugarCaneDAO {

	public void put(SugarCaneEntity caneEntity) {
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(caneEntity);
		entityTransaction.commit();
	}
}
