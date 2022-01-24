package com.xworkz.webseries.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.webseries.dao.WebSeriesDAO;


public class EMFUtil {
	private static WebSeriesDAO entityManegefactory() {
		return entityManegefactory();
	}
	static {
		EntityManagerFactory entityManegefactory = Persistence.createEntityManagerFactory("com.xworkz.webseries");
		System.out.println("adding data");
	}
}
