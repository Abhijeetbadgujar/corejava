package com.xworkz.airport.Stater;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDaoImpl;
import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.airport.entity.flightEnum.DOMASTIC_FLIGHTS;
import com.xworkz.airport.entity.flightEnum.INTERNATIONAL_FLIGHTS;

public class AirportRunner {

	public static void main(String[] args) {

		AirportEntity airportEntity=new AirportEntity( "CSMT","123455","metropolitan","mumbai","maharashtra",540,440,980,2,true,true,78,940,1000);
		AirportEntity airportEntity1=new AirportEntity( "CSamMT", "567890", "chikhathana", "aurangabad", "maharahstra",4, 4, 9,1, false, false,3, 9, 9 );
		AirportDAO dao=new AirportDaoImpl();
		dao.save(airportEntity);
	}

}
