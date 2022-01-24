package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tourist.entity.RailwayStationEntity;
import com.xworkz.tourist.util.EMFUtil;

public class RailwayStationDAOImpl implements RailwayStationDAO {
	
public void put(RailwayStationEntity entity) {
	EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(entity);
	entityTransaction.commit();
}
}
