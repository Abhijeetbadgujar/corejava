package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.util.EMFUtil;

public class VendorDaoImpl implements VendorDao {

	@Override
	public void save(VendorEntity entity) {

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
