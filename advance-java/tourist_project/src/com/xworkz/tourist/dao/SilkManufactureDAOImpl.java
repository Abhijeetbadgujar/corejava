package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.workz.tourist.util.EMFUtil;
import com.xworkz.tourist.entity.SilkManufactureEntity;

public class SilkManufactureDAOImpl implements SilkManufactureDAO {
public void put(SilkManufactureEntity manufactureEntity) {
	EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(manufactureEntity);
	entityTransaction.commit();
}
}
