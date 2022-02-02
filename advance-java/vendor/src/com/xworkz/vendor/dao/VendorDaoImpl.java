package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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

	@Override
	public boolean findLogin(String loginName, String password) {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		try {
			Query query=entityManager.createNamedQuery("findLogin");
			query.setParameter("log", loginName);
			query.setParameter("pass",password);
			Object object=query.getSingleResult();
			VendorEntity vendorEntity=(VendorEntity)object;
			System.out.println(vendorEntity);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return false;
	}

	@Override
	public boolean findByEmail(String email) {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		try {
			Query query=entityManager.createNamedQuery("findByEmail");
			query.setParameter("email",email);
			Object object=query.getSingleResult();
			VendorEntity vendorEntity=(VendorEntity)object;
			System.out.println(vendorEntity);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return false;
	}

	@Override
	public boolean updatePasswordByEmail(String email, String password) {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		try {
			Query query=entityManager.createNamedQuery("updatePasswordByEmail");
			query.setParameter("email", email);
			query.setParameter("pass",password);
			Object object=query.getSingleResult();
			VendorEntity vendorEntity=(VendorEntity)object;
			System.out.println(vendorEntity);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return false;
	}
	
	
	

}
