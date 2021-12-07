package com.xworkz.crudoperation;

public class ArrayBusRouteDAO implements BusRouteDAO{
	private BusRouteDTO[] busRouteDTO=new BusRouteDTO[6];
	private int counter=0;
	
	public ArrayBusRouteDAO() {
		System.out.println("invoked the ArrayBusRoute no-arg constructor");
	}
	@Override
	public boolean save(BusRouteDTO dto) {
		if(dto!=null) {
			this.busRouteDTO[counter]=dto;
			System.out.println("the save method is run");
		}
		return true;
	}
	@Override
	public boolean update(int i,BusRouteDTO dto) {
		if(dto!=null) {
			this.busRouteDTO[i]=dto;
			System.out.println("update the two variable");
			
		}
		return true;
	}
	@Override
	public void delete(int i) {
		if(i!=0 && i<this.busRouteDTO.length) {
			this.busRouteDTO[i]=null;
			System.out.println("bus in delete:");
		
		}
	}
	@Override
	public void display() {
		for(int cool=0;cool<this.busRouteDTO.length;cool++) {
			if(this.busRouteDTO[cool]!=null) {
				System.out.println(busRouteDTO[cool].getDriverName());
				System.out.println(busRouteDTO[cool].getDestination());
				System.out.println(busRouteDTO[cool].getBusPoint());
				System.out.println(busRouteDTO[cool].getId());
			}else {
				System.err.println("pointing to null at index:"+cool);
			}
		}
	}
	
	@Override
	public String savereturnString(BusRouteDTO dto) {
		// TODO Auto-generated method stub
		return "SUCCES";
	}
}
