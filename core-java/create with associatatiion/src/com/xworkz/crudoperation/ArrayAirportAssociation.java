package com.xworkz.crudoperation;

public class ArrayAirportAssociation {
	AirportDAO airportDAO;

	public ArrayAirportAssociation(AirportDAO airportDAO) {
		super();
		this.airportDAO = airportDAO;
	}
	
	public void saveAirportDAO(AirportDTO airportDTO) {
		//String ref=AirportDAO.save(airportDTO);
		System.out.println("invoked the save method in ArrayAirportAssociation"+airportDTO);
		System.out.println("-----------------------");
	}
	public boolean updateAirportDAO(int index,AirportDTO airportDTO) {
		boolean ref=airportDAO.update(5,airportDTO);
		System.out.println("invoked the update method ");
		System.out.println("-----------------------");
		return true;
	}
	public void deleteAirportDAO(int index) {
		System.out.println("delete found");
		System.out.println("-----------------------");
	}
	public void displaydetails() {
		airportDAO.display();
	}
}
