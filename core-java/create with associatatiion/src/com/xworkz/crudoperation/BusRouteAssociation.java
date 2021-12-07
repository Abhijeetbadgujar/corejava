package com.xworkz.crudoperation;

public class BusRouteAssociation{
	BusRouteDAO busRouteDAO;

	public BusRouteAssociation(BusRouteDAO busRouteDAO) {
		super();
		this.busRouteDAO = busRouteDAO;
	}
	
	    void saveBusRoute(BusRouteDTO routeDTO) {
		boolean ref=busRouteDAO.save(routeDTO);
		System.out.println("save method in association:"+ref);
		System.out.println("---------------------------");
	}
	/*void saveBusRoute(BusRouteDTO routeDTO) {
		System.out.println("invoked the save method in association");
		 
	}
	*/
	void saveBusRoute1(BusRouteDTO routeDTO) {
		String ref=busRouteDAO.savereturnString(routeDTO);
		System.out.println("save method in association:"+ref);
		System.out.println("---------------------------");
	}
	void updateBusRoute(BusRouteDTO busRoute,int i) {
		boolean ref1=busRouteDAO.update(4, busRoute);
		System.out.println("invoked the update method in association:"+ref1);
		System.out.println("---------------------------");
	}
	void deleteBusRoute(int i) {
		System.out.println("delete found ");
		//boolean ref2=busRouteDAO.delete(4);
		System.out.println("----------------------------");
	}
	void displayDetails() {
		busRouteDAO.display();
	}
	
}
