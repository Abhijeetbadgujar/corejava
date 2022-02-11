package com.xworkz.plate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.mysql.cj.Query;
import com.xworkz.plate.entity.PlateEntity;
import com.xworkz.plate.util.EMFUtil;

public class PlateDaoImpl implements PlateDao {

	@Override
	public void fetchById(int entity) {

		EntityManager session = EMFUtil.getEntityManagerFactory().createEntityManager();
		//session.persist(entity);
		EntityTransaction transaction = session.getTransaction();
		try {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<PlateEntity> criteriaQuery = builder.createQuery(PlateEntity.class);
			Root<PlateEntity> root = criteriaQuery.from(PlateEntity.class);
			// criteriabuilder:-Used to construct criteria queries
			// CriteriaQuery:- it is the type-safe in terms of referencing attributes or
			// retriving attributes.
			// root:- roots are define the basic from which joins, paths and attributes are
			// available in the query

			// Root<PlateEntity>
			// root=session.getCriteriaBuilder().createQuery(PlateEntity.class).from(PlateEntity.class);
			criteriaQuery.select(root);
			 criteriaQuery.where(builder.equal(root.get("id"), 2));
			// criteriaQuery.where(builder.equal(root.get("brand"), "xyz"));
			TypedQuery<PlateEntity> query = session.createQuery(criteriaQuery);
			List<PlateEntity> list = query.getResultList();
			list.forEach(System.out::println);
//			for(PlateEntity plates:list) {
//				System.out.println(plates.getColor());
//				System.out.println(plates.getBrand());
//				System.out.println(plates.getPrice());
//				System.out.println(plates.getId());
//			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		session.close();
	}

	

}
