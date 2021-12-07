package com.xworkz.crudoperation;

public class ArrayAirportStater {

	public static void main(String[] args) {

		AirportDTO airportDTO=new AirportDTO("Airbus 380","hydrabad airport","cargo","irland");
		
		AirportDAO airportDAO=new ArrayAirportDAO();
		ArrayAirportAssociation airportAssociation=new ArrayAirportAssociation(airportDAO);
		airportAssociation.saveAirportDAO(airportDTO);
		airportAssociation.updateAirportDAO(6, airportDTO);
		airportAssociation.deleteAirportDAO(5);
		airportAssociation.displaydetails();
		
		
	}

}
