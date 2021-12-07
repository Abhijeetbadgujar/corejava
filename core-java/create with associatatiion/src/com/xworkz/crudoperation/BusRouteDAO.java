package com.xworkz.crudoperation;

public interface BusRouteDAO{
	
	boolean save(BusRouteDTO dto);
	boolean update(int i,BusRouteDTO dto);
	void delete(int i);
	void display();
	String savereturnString(BusRouteDTO dto);
	
	
	
}
