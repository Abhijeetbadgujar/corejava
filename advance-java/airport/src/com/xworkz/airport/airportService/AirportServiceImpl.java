package com.xworkz.airport.airportService;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.entity.AirportEntity;

import lombok.NonNull;

public class AirportServiceImpl implements AirportService {
	private AirportEntity[] daos=new AirportEntity[7];
	private int counter=0;

	public AirportServiceImpl(AirportEntity[] airportEntity) {
		this.daos = airportEntity;
	}

	@Override
	
	public AirportEntity validataAndSave(AirportEntity airportEntity) {
	
		if((airportEntity.getName()!=null && airportEntity.getName().length()>=4) && airportEntity.getName().length()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getPassword()!=null && airportEntity.getName().length()>=4) && airportEntity.getPassword().length()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getLocation()!=null && airportEntity.getName().length()>=4) && airportEntity.getPassword().length()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getCity()!=null && airportEntity.getName().length()>=4) && airportEntity.getPassword().length()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getState()!=null && airportEntity.getName().length()>=4) && airportEntity.getState().length()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getDomastic_flights()!=0 && airportEntity.getName().length()>=4) && airportEntity.getDomastic_flights()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getInternational_flights()!=0 && airportEntity.getName().length()>=4) && airportEntity.getInternational_flights()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getCapacity()!=0 && airportEntity.getName().length()>=4) && airportEntity.getCapacity()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getNo_of_runways()!=0 && airportEntity.getName().length()>=4) && airportEntity.getNo_of_runways()<=0){
			this.daos[counter]=airportEntity;
		}
		if(airportEntity.isRepair_center()!=false ){
			this.daos[counter]=airportEntity;
		}
		if(airportEntity.isInternational_or_not()!=false ){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getNo_of_gates()!=0 && airportEntity.getName().length()>=4) && airportEntity.getNo_of_gates()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getCreated_By_name()!=null && airportEntity.getName().length()>=4) && airportEntity.getCreated_By_name().length()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getCreated_By_dateWithSeconds()!=null && airportEntity.getName().length()>=4) ){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getUpdate_By()!=null && airportEntity.getName().length()>=4) && airportEntity.getUpdate_By().length()<=0){
			this.daos[counter]=airportEntity;
		}
		if((airportEntity.getUpdate_AT()!=null && airportEntity.getName().length()>=4) ){
			this.daos[counter]=airportEntity;
		}
		
		return airportEntity;
		}
	

}
