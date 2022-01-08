package com.xworkz.world.dao;

import com.xworkz.world.entity.CityEntity;

public class CityStater {

	public static void main(String[] args) {

		CityEntity cityEntity = new CityEntity(6, "aurangabad", "green", "caves", 16000000l);
		CityEntity cityEntity1 = new CityEntity(7, "aurangabad", "green", "caves", 16000000l);
		CityEntity cityEntity2 = new CityEntity(8, "aurangabad", "green", "caves", 16000000l);
		CityEntity cityEntity3 = new CityEntity(9, "aurangabad", "green", "caves", 16000000l);
		CityEntity cityEntity4 = new CityEntity(10, "aurangabad", "green", "caves", 16000000l);
		CityInterface cityInterface = new CityDAOImple();
		cityInterface.create(cityEntity);
		cityInterface.create(cityEntity1);
		cityInterface.create(cityEntity2);
		cityInterface.create(cityEntity3);
		cityInterface.create(cityEntity4);
		
	}

}
