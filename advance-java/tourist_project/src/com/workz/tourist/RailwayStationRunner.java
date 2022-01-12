package com.workz.tourist;

import com.xworkz.tourist.dao.RailwayStationDAO;
import com.xworkz.tourist.dao.RailwayStationDAOImpl;
import com.xworkz.tourist.entity.RailwayStationEntity;

public class RailwayStationRunner {

	public static void main(String[] args) {

		RailwayStationEntity entity=new RailwayStationEntity(1, "csmt", "csmt", 10, "mumbai");
		RailwayStationEntity entity1=new RailwayStationEntity(2, "csambajimt", "baba petrol", 4, "aurangabad");
		RailwayStationDAO dao=new RailwayStationDAOImpl();
		dao.put(entity);
		dao.put(entity1);
		
	}

}
