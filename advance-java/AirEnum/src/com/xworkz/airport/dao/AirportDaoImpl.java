package com.xworkz.airport.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.airport.entity.AirEnumEntity.AirportEntity;
import com.xworkz.airport.util.EMFUtil;

public class AirportDaoImpl implements AirportDAO{

	@Override
	public void save(AirportEntity entity) {
		
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(entity);
			transaction.commit();
			
		} catch (PersistenceException e) {
			e.getStackTrace();
		}
		finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		
	}

	

}
