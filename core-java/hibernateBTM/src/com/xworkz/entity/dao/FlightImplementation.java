package com.xworkz.entity.dao;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.FlightEntity;

public class FlightImplementation implements FlightInterface{
	@Override
	public void save(FlightEntity entity) {
	System.out.println("invoked the entity:"+entity);
	
	Configuration configuration=new Configuration();
	configuration.configure("db.xml");
	configuration.addAnnotatedClass(FlightEntity.class);
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction= session.beginTransaction();
	session.save(entity);
	transaction.commit();
	session.close();
	factory.close();
	
	
	
	}
}
