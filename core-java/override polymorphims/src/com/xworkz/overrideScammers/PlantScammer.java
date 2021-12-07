package com.xworkz.overrideScammers;

import com.xworkz.override.Plant;
import com.xworkz.override.PlantType;

public class PlantScammer {

	public static void main(String[] args) {

		Plant plant=new Plant();
		Plant plant1=new Plant();
		
		System.out.println(plant.toString());//implicit means compiler are 
					//automatically invoked
		
		System.out.println(plant.hashCode());// getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		plant.setType(PlantType.WEL);
		plant1.setType(PlantType.WEL);
		plant.setName("kumodini");
		plant1.setName("kumodini");
		System.out.println(plant.equals(plant1));
		
	}

}
