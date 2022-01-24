package com.xworkz.tourist.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tourist.entity.TouristEntity;
import com.xworkz.tourist.util.EMFUtil;

/*public class TouristDAOImpl implements TouristDAO {
	public void put(TouristEntity entity) {
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//TouristEntity t_Entity=entityManager.cre
		//EntityTransaction entityTransaction= entityManager.getTransaction();
		EntityTransaction tran= entityManager.getTransaction();
		tran.begin();
		entityManager.persist(entity);
		tran.commit();*/
		public class TouristDAOImpl implements TouristDAO {

			public void put(TouristDAOImpl entity) {
				EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
				EntityManager entityManager = emf.createEntityManager();
				EntityTransaction tx = entityManager.getTransaction();
				tx.begin();

				int flushCount = 0;
				try {
					for (int i = 0; i < 20; i++) {
						if (flushCount == 5) {
							entityManager.flush();
							flushCount = 0;
							entityManager.clear();
						}
						entityManager.flush();
						flushCount++;
					}
				} catch (PersistenceException e) {
					e.printStackTrace();
					tx.rollback();
				}

				tx.commit();
			}

			public void putAll(List<TouristEntity> entities) {
				EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
				for (TouristEntity tourEntity : entities) {
					manager.persist(tourEntity);

					EntityTransaction tx = manager.getTransaction();

					tx.begin();

					int flushCount = 0;
					try {
						for (int i = 0; i < 20; i++) {
							if (flushCount == 5) {
								manager.flush();
								flushCount = 0;
								manager.clear();
							}
							manager.flush();
							flushCount++;
						}
					} catch (PersistenceException e) {
						e.printStackTrace();
						tx.rollback();
					}

					tx.commit();
				}
			}

			@Override
			public void put(TouristEntity entity) {
				// TODO Auto-generated method stub
				
			}
		
	}

