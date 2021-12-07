package com.xworkz.crudoperation;

public class BusRouteStater {

	public static void main(String[] args) {

		BusRouteDTO busRouteDTO=new BusRouteDTO("Ab143","mayco layout","anad rao circle","gimmy");
		
		BusRouteDAO busRouteDAO=new ArrayBusRouteDAO();
		BusRouteAssociation association=new BusRouteAssociation(busRouteDAO);
		association.saveBusRoute(busRouteDTO);
		association.updateBusRoute(busRouteDTO, 4);
		association.deleteBusRoute(4);
		association.displayDetails();
	}

}
