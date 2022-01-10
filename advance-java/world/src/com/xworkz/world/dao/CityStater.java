package com.xworkz.world.dao;

import com.xworkz.world.entity.CityEntity;

public class CityStater {

	public static void main(String[] args) {

		CityEntity cityEntity = new CityEntity(6, "aurangabad", "green", "caves", 16000000l);
		CityEntity cityEntity1 = new CityEntity(7, "mumbai", "green", "population", 16000000l);
		CityEntity cityEntity2 = new CityEntity(8, "bangalore", "green", "chandan", 16000000l);
		CityEntity cityEntity3 = new CityEntity(9, "dilhi", "green", "western culture", 16000000l);
		CityEntity cityEntity4 = new CityEntity(10, "jaypur", "green", "mahal", 16000000l);
		CityInterface cityInterface = new CityDAOImple();
//		cityInterface.create(cityEntity);
//		cityInterface.create(cityEntity1);
//		cityInterface.create(cityEntity2);
//		cityInterface.create(cityEntity3);
//		cityInterface.create(cityEntity4);
		CityEntity Ci_entity=cityInterface.getById(9);
		System.out.println(Ci_entity);
		cityInterface.updateCity_name("amhdabad", 9);
		cityInterface.delete(10);
		
	}

}
