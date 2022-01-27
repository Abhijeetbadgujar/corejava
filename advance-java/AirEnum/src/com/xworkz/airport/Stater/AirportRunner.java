package com.xworkz.airport.Stater;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.airport.entity.flightEnum.DOMASTIC_FLIGHTS;

public class AirportRunner {

	public static void main(String[] args) {

		
		AirportEntity airportEntity=new AirportEntity("", null, null, null, null, DOMASTIC_FLIGHTS.INDIGO, null, 0, 0, false, false, 0, 0, 0);
	}

}
