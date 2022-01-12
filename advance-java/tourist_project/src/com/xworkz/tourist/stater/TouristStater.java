package com.xworkz.tourist.stater;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.dao.TouristDAOImpl;
import com.xworkz.tourist.entity.TouristEntity;

public class TouristStater {

	public static void main(String[] args) {

	//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz.tourist");
	//	System.out.println(entityManagerFactory);
		TouristEntity touristEntity=new TouristEntity(2, "goga baba", 45,"hills", 20, "winter");
		TouristEntity touristEntity1=new TouristEntity(3, "ajintha", 45,"caves", 20, "any season");

		TouristDAO dao=new TouristDAOImpl();
		//dao.put(touristEntity);
		dao.put(touristEntity1);
	}

}
