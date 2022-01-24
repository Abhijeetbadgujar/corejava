package com.xworkz.tourist.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.tourist.entity.WebsiteEntity;
import com.xworkz.tourist.util.EMFUtil;

public class WebsiteDAOImpl implements WebsiteDAO {
	
	public void save(WebsiteEntity entity) {
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
	}
	public WebsiteEntity getByNameflipkart() {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("GetByNameflipkart");
			Object object=query.getSingleResult();
			WebsiteEntity websiteEntity=(WebsiteEntity)object;
			System.out.println(websiteEntity);
			return websiteEntity;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public WebsiteEntity getgetByLikeUrlX() {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getByLikeUrlX");
			Object object=query.getSingleResult();
			WebsiteEntity websiteEntity=(WebsiteEntity)object;
			System.out.println(websiteEntity);
		} catch ( PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
}
