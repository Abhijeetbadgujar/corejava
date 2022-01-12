package com.xworkz.tourist.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.mysql.cj.util.Util;
import com.workz.tourist.util.EMFUtil;
import com.xworkz.tourist.entity.FactoryEntity;

public class FactoryDAOImpl implements FactoryDAO{
public void put(FactoryEntity entity) {
	EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(entity);
	transaction.commit();
}
}
