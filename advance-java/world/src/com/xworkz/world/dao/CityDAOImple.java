package com.xworkz.world.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.world.entity.CityEntity;

public class CityDAOImple implements CityInterface {
	@Override
	public void create(CityEntity entity) {

		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(CityEntity.class);
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			System.out.println("invoked the create entity");
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			session.close();
		}
		factory.close();
	}

}
