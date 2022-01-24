package com.xworkz.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.util.EMFUtil;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void save(ProductEntity productEntity) {

		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(productEntity);
		transaction.commit();
	}

	@Override
	public void saveAll(List<ProductEntity> productEntity) {
			EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
			for (ProductEntity tourEntity : productEntity) {
				manager.persist(tourEntity);

				EntityTransaction tx = manager.getTransaction();

				tx.begin();
				int flushCount = 0;
				try {
					for (int i = 0; i < 9; i++) {
						if (flushCount == 3) {
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
	public List<ProductEntity> getAll() {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getAll");
			return (List<ProductEntity>) query.getResultList();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return null;
	}

	@Override
	public List<Integer> getBypriceGreaterThan(Integer price) {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getBypriceGreaterThan");
			query.setParameter("cutoffPrice", price);
			return (List<Integer>) query.getResultList();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Integer> getBypriceLessThan(Integer price) {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getBypriceLessThan");
			query.setParameter("cutofPrice", price);
			return (List<Integer>) query.getResultList();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public ProductEntity getByNameAndId(String name, int id) {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getByNameAndId");
			query.setParameter("setname", name);
			query.setParameter("setid", id);
			return (ProductEntity) query.getSingleResult();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> getTotalName() {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getTotalName");
			return (List<String>) query.getResultList();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getMaxPrice() {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getMaxPrice");

			return (Integer) query.getSingleResult();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(entityManager!=null) {
				entityManager.close(); 
				
			}
		}
		return 0;
	}

	@Override
	public int getTotalPrice() {
		EntityManager entityManager=EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getTotalPrice");

			return (Integer) query.getSingleResult();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			if(entityManager!=null) {
				entityManager.close(); 
				
			}
		}
		return 0;
	}
	 
}
