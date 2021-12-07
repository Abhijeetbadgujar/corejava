package com.xworkz.crudoperation;

public class ArrayAirportDAO implements AirportDAO{
	private AirportDTO[] airportDTOs=new AirportDTO[7];
	private int counter=0;
	
	public ArrayAirportDAO() {
		System.out.println("invoked the ArrayAirportDAO with no-arg constructor");
	}
	@Override
	public void save(AirportDTO airportDTO) {
		if(airportDTO!=null) {
			this.airportDTOs[counter]=airportDTO;
			System.out.println("the save method of planeName:"+airportDTO);
		}
	}
	@Override
	public boolean update(int index,AirportDTO airportDTO) {
		if(index<=this.airportDTOs.length && index>=0 && airportDTO!=null) {
			this.airportDTOs[index]=airportDTO;
			System.out.println("the update method in ArrayAirportDTO ");
			return true;
		}
		return false;
	}
	@Override
	public void delete(int index) {
		if(index<=this.airportDTOs.length && index>=0) {
			this.airportDTOs[index]=null;
			System.out.println("the delete method in ArrayAirportDTO");
		}
	}
	@Override
	public void display() {
		for(int popcon=0;popcon<this.airportDTOs.length;popcon++) {
			if(this.airportDTOs[popcon]!=null){
				System.out.println(airportDTOs[popcon].getPlaneName());
				System.out.println(airportDTOs[popcon].getCountryName());
				System.out.println(airportDTOs[popcon].getLocation());
				System.out.println(airportDTOs[popcon].getType());
				
			}
		}
	}
}
