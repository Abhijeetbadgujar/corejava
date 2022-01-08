package com.xworkz.world.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.world.entity.PatientEntity;

public class PatientDAOImple implements PatientInterface {
	@Override
	public void create(PatientEntity entity) {
		Configuration configuration=new Configuration();
		configuration.addAnnotatedClass(PatientEntity.class);
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		if(factory!=null) {
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			transaction.commit();
			session.close();
		}
		factory.close();
	}

}
