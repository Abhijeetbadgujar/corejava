package com.workz.tourist;

import com.xworkz.tourist.dao.SolarSystemDAO;
import com.xworkz.tourist.dao.SolarSystemDAOImpl;
import com.xworkz.tourist.entity.SolarSystemEntity;

public class SolarSystemRunner {

	public static void main(String[] args) {

		SolarSystemEntity entity=new SolarSystemEntity(22, "laxmi", 250,24, 22000);
		SolarSystemEntity entity1=new SolarSystemEntity(33, "super", 300,30, 22000);
		SolarSystemDAO dao=new SolarSystemDAOImpl();
		dao.put(entity);
		dao.put(entity1);
	}

}
