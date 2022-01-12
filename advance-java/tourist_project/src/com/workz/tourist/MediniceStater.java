package com.workz.tourist;

import com.xworkz.tourist.dao.MedicineDAO;
import com.xworkz.tourist.dao.MedicineDAOImpl;

import com.xworkz.tourist.entity.MedicineEntity;

public class MediniceStater {

	public static void main(String[] args) {
		MedicineEntity entity = new MedicineEntity(11, "dolo650", "drug", 10);
		MedicineEntity entity1 = new MedicineEntity(2, "paracitamol", "drug", 10);
		MedicineDAO dao = new MedicineDAOImpl();
		dao.put(entity);
		dao.put(entity1);
	}

}
