package com.workz.tourist;


import com.xworkz.tourist.dao.AirportDAO;
import com.xworkz.tourist.dao.AirportDAOImpl;
import com.xworkz.tourist.entity.AirportEntity;

public class AirportStater {

	public static void main(String[] args) {

		AirportEntity entity=new AirportEntity(7,"sambhaji maharaj","Abhijeet",40);
		AirportEntity entity1=new AirportEntity(9,"cmst","Abhijeet",400);
		AirportDAO dao=new AirportDAOImpl();
		dao.put(entity);
		dao.put(entity1);
	}

}
