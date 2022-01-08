package com.xworkz.world.dao;

import com.xworkz.world.entity.CountryEntity;

public class CountryStater {

	public static void main(String[] args) {

		CountryEntity countryEntity=new CountryEntity(1, "india","dilhi",28393833);
		CountryEntity countryEntity1=new CountryEntity(2, "south korea","seoul",28393833l);
		CountryEntity countryEntity2=new CountryEntity(3, "thailand","bankoke",28393833l);
		CountryEntity countryEntity3=new CountryEntity(4, "ajarbaizan","ajarbaizan",28393833l);
		CountryEntity countryEntity4=new CountryEntity(5, "germany","berlin",28393833l);
		CountryInterface countryInterface=new CountryDAOImple();
		countryInterface.create(countryEntity);
		countryInterface.create(countryEntity1);
		countryInterface.create(countryEntity2);
		countryInterface.create(countryEntity3);
		countryInterface.create(countryEntity4);
		
	}

}
