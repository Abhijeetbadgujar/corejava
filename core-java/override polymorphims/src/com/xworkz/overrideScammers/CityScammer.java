package com.xworkz.overrideScammers;

import com.xworkz.override.City;

public class CityScammer {

	public static void main(String[] args) {

		City city=new City();
		City city1=new City();
		
		System.out.println(city.toString());
		
		System.out.println(city.hashCode());
		
		city.setName("busan");
		city1.setName("busan");
		city.setCountry("south korea");
		city1.setCountry("south korea");
		System.out.println(city.equals(city1) );
	}

}
