package com.workz.tourist;

import com.xworkz.tourist.dao.SilkManufactureDAO;
import com.xworkz.tourist.dao.SilkManufactureDAOImpl;
import com.xworkz.tourist.entity.SilkManufactureEntity;

public class SilkManufactureStater {

	public static void main(String[] args) {

		SilkManufactureEntity entity=new SilkManufactureEntity(11, "peter england","uk", 80, "winter");
		SilkManufactureEntity entity1=new SilkManufactureEntity(12, "cooper","korean", 70, "winter");
		SilkManufactureDAO dao=new SilkManufactureDAOImpl();
		dao.put(entity);
		dao.put(entity1);
	}

}
