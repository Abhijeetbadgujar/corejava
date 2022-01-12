package com.workz.tourist;

import com.xworkz.tourist.dao.FactoryDAO;
import com.xworkz.tourist.dao.FactoryDAOImpl;
import com.xworkz.tourist.entity.FactoryEntity;

public class FactoryStater {

	public static void main(String[] args) {

		FactoryEntity entity=new FactoryEntity(1, "AB airlines", "Abhi properties", "aeroplanes", "Abhijeet");
		FactoryEntity entity1=new FactoryEntity(2, "AB carco", "Abhi properties", "jet", "Abhijeet");
		FactoryDAO dao=new FactoryDAOImpl();
		dao.put(entity);
		dao.put(entity1);
	}

}
