package com.xworkz.airport.Stater;


import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDaoImpl;
import com.xworkz.airport.entity.AirEnumEntity.AirportEntity;
import com.xworkz.airport.entity.flightEnum.DOMASTIC_FLIGHTS;
import com.xworkz.airport.entity.flightEnum.INTERNATIONAL_FLIGHTS;

public class AirportRunner {

	public static void main(String[] args) {

		
		AirportEntity airportEntity2=new AirportEntity("CSssMT", "123d455", "metropolitan", "mumbai", "maharashtra",DOMASTIC_FLIGHTS.VISTARA,
				INTERNATIONAL_FLIGHTS.LUFTHANSA, 980, 2, true, true, 78, 940, 1000);
		// AirportEntity airportEntity1=new AirportEntity( "CSamMT", "567890",
		// "chikhathana", "aurangabad", "maharahstra",4, 4, 9,1, false, false,3, 9, 9 );
		AirportDAO dao = new AirportDaoImpl();
//
//		AirportService airportService = new AirportServiceImpl(dao);
//		airportService.validataAndSave(airportEntity);

	}

}
