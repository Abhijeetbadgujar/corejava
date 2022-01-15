package com.xworkz.tourist.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.workz.tourist.util.EMFUtil;
import com.xworkz.tourist.entity.MedicineEntity;

public class MedicineDAOImpl implements MedicineDAO {

	public void put(MedicineEntity medicineEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		int flushCase = 0;
		for (int i = 0; i < 34; i++) {
			try {
				if (flushCase == 4) {
					entityManager.flush();
					flushCase = 0;
					entityManager.clear();
				}
				entityManager.flush();
				flushCase++;

			} catch (Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
		}
		entityTransaction.commit();

	}

	@Override
	public void putAll(List<MedicineEntity> medicineEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		int flushCase = 0;
		for (int r = 0; r < 34; r++) {
			try {
				if (flushCase == 4) {
					entityManager.flush();
					flushCase = 0;
				}
				entityManager.flush();
				flushCase++;
			} catch (Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
		}
		transaction.commit();
	}
}
