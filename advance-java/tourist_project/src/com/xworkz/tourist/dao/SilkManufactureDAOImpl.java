package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tourist.entity.SilkManufactureEntity;
import com.xworkz.tourist.util.EMFUtil;

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
