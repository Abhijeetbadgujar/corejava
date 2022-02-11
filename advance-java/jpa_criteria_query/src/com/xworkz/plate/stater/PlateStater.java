package com.xworkz.plate.stater;

import com.xworkz.plate.dao.PlateDao;
import com.xworkz.plate.dao.PlateDaoImpl;
import com.xworkz.plate.entity.PlateEntity;

public class PlateStater {

	public static void main(String[] args) {

		PlateEntity plateEntity=new PlateEntity("nirlab","white", 250);
		PlateEntity plateEntity1=new PlateEntity("nirlabss","black", 300);
		
		PlateDao dao=new PlateDaoImpl();
		//dao.save(plateEntity);
		dao.fetchById(1);
		dao.fetchById(2);
	}
}