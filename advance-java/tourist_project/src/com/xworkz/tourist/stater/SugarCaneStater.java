package com.xworkz.tourist.stater;

import com.xworkz.tourist.dao.SugarCaneDAO;
import com.xworkz.tourist.dao.SugarCaneDAOImpl;
import com.xworkz.tourist.entity.SugarCaneEntity;

public class SugarCaneStater {

	public static void main(String[] args) {

		SugarCaneEntity caneEntity=new SugarCaneEntity(1, "gavthi", "kannad", 500, "kannad");
		SugarCaneEntity caneEntity1=new SugarCaneEntity(14, "gavthi", "kannad", 500, "kannad");
		SugarCaneDAO caneDAO=new SugarCaneDAOImpl();
		caneDAO.put(caneEntity);
		caneDAO.put(caneEntity1);
	}

}
