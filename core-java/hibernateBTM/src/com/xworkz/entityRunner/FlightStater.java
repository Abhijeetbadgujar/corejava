package com.xworkz.entityRunner;

import com.xworkz.entity.FlightEntity;
import com.xworkz.entity.dao.FlightImplementation;
import com.xworkz.entity.dao.FlightInterface;

public class FlightStater {

	public static void main(String[] args) {

		FlightInterface flightEntity=new FlightImplementation();
		flightEntity.save(new FlightEntity());
	}

}
