package com.xworkz.world.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.world.entity.CountryEntity;

public class CountryDAOImple implements CountryInterface{
	@Override
	public void create(CountryEntity entity) {
		System.out.println("invoked the create countryInterface");
		System.out.println(entity);
		Configuration configuration=new Configuration();
		configuration.addAnnotatedClass(CountryEntity.class);
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			session.close();
		}
		factory.close();
	}

	
}
