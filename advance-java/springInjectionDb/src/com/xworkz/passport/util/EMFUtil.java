package com.xworkz.passport.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

	private static EntityManagerFactory enitityMangerfactory;
	
	public static EntityManagerFactory getEnitityMangerfactory() {
		return enitityMangerfactory;
	}
	static {
		enitityMangerfactory=Persistence.createEntityManagerFactory("com.xworkz.airport");
	}
}

