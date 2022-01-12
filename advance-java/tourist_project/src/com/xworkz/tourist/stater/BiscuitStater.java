package com.xworkz.tourist.stater;

import com.xworkz.tourist.dao.BiscuitDAO;
import com.xworkz.tourist.dao.BiscuitDAOImpl;
import com.xworkz.tourist.entity.BiscuitEntity;

public class BiscuitStater {

	public static void main(String[] args) {

		BiscuitEntity entity=new BiscuitEntity(5, "broban", "parle", "brown",35 );
		BiscuitEntity entity1=new BiscuitEntity(6, "hide and see", "parle", "brown",40 );
		BiscuitDAO dao=new BiscuitDAOImpl();
		dao.put(entity);
		dao.put(entity1);
	}

}
