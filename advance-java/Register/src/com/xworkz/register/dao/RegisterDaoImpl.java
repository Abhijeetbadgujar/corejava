package com.xworkz.register.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.register.Entity.RegisterEntity;
import com.xworkz.register.util.EMFUtil;

public class RegisterDaoImpl implements RegisterDao {

	@Override
	public void save(RegisterEntity entity) {

		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

}
