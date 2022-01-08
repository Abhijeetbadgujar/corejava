package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;

public class CompanyDAOImplement implements CompanyInterface{
@Override
public void create(CompanyEntity entity) {
	System.out.println("Invoked the create CompanyDAOImplement");
	System.out.println(entity);
	Configuration configuration=new Configuration();
	configuration.configure();
	configuration.addAnnotatedClass(CompanyEntity.class);
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	if(sessionFactory!=null) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(entity);
		tx.commit();
		session.close();
	}
		sessionFactory.close();
}

}
