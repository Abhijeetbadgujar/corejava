package com.xworkz.entityRunner;

import com.xworkz.entity.FlightEntity;
import com.xworkz.entity.dao.FlightImplementation;
import com.xworkz.entity.dao.FlightInterface;

public class FlightStater {

	public static void main(String[] args) {

		//FlightInterface flightInterface=new FlightImplementation();
		//flightInterface.save(entity);
		FlightEntity entity=new FlightEntity();
		entity.setF_id(2);
		entity.setF_name("vistara");
		entity.setF_source("bangalore");
		entity.setF_dest("aurangabad");
		FlightInterface flightInterface=new FlightImplementation();
		flightInterface.save(entity);

	}

}
