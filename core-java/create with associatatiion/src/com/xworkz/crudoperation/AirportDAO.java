package com.xworkz.crudoperation;

public interface AirportDAO {
	void save(AirportDTO airportDTO);
	boolean update(int index,AirportDTO airportDTO);
	void delete(int index);
	void display();
}
