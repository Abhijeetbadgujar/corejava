package com.xworkz.passport.passportDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.util.EMFUtil;

public class PassportDaoImpl implements PassportDao {

	@Override
	public void save(PassportEntity entity) {

		EntityManager entityManager=EMFUtil.getEnitityMangerfactory().createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		try {
			if(entityManager!=null) {
				entityManager.persist(entity);
				transaction.commit();
			}
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		entityManager.close();
	}

}
