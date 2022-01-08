package com.xworkz.world.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.world.entity.StateEntity;

public class StateDAOImple implements StateInterface{
@Override
public void create(StateEntity entity) {
	System.out.println("invoked the create entity");
	Configuration configuration=new Configuration();
	configuration.addAnnotatedClass(StateEntity.class);
	configuration.configure();
	SessionFactory factory=configuration.buildSessionFactory();
	if(factory!=null) {
		System.out.println("factory is not null");
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
	factory.close();
	System.out.println("all method is closed");
}
}
