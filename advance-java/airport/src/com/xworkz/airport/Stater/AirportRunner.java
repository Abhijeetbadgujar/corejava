package com.xworkz.airport.Stater;

import java.time.LocalDateTime;

import com.xworkz.airport.airportService.AirportService;
import com.xworkz.airport.airportService.AirportServiceImpl;
import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDaoImpl;
import com.xworkz.airport.entity.AirportEntity;

public class AirportRunner {

	public static void main(String[] args) {

		AirportEntity airportEntity = new AirportEntity("CSMT", "123455", "metropolitan", "mumbai", "maharashtra", 540,
				440, 980, 2, true, true, 78, 940, 1000, "Abhijeet", LocalDateTime.now(), "vandana",
				LocalDateTime.now());
		// AirportEntity airportEntity1=new AirportEntity( "CSamMT", "567890",
		// "chikhathana","aurangabad", "maharahstra",4, 4, 9,1, false, false,3, 9, 9 );
		AirportDAO dao = new AirportDaoImpl();

		AirportService airportService = new AirportServiceImpl(dao);
		airportService.validataAndSave(airportEntity);
	}

}
