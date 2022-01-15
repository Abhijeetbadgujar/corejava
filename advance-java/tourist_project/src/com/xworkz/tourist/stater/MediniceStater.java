package com.xworkz.tourist.stater;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tourist.dao.MedicineDAO;
import com.xworkz.tourist.dao.MedicineDAOImpl;

import com.xworkz.tourist.entity.MedicineEntity;

public class MediniceStater {

	public static void main(String[] args) {
		List<MedicineEntity> entity=new ArrayList<MedicineEntity>();
		entity.add(new MedicineEntity(11, "dolo650", "drug", 10));
		entity.add(new MedicineEntity(22, "paracitamol", "drug", 10));  
//		entity.add(new MedicineEntity(33, "Nausea", "drug", 10));
//		entity.add(new MedicineEntity(44, "Abacavir", "drug", 10));
//		entity.add(new MedicineEntity(55, "lamivudine ", "drug", 10));  
//		entity.add(new MedicineEntity(66, "dolutegravir ", "drug", 10));
//		entity.add(new MedicineEntity(77, "Abacavir ", "drug", 10));
//		entity.add(new MedicineEntity(88, "Acyclovir", "drug", 10));  
//		entity.add(new MedicineEntity(99, "Alemtuzumab", "drug", 10));
//		entity.add(new MedicineEntity(110, "Alendronate", "drug", 10));
//		entity.add(new MedicineEntity(111, "Allopurinol", "drug", 10));  
//		entity.add(new MedicineEntity(112, "Amifostine", "drug", 10));
//		entity.add(new MedicineEntity(113, "Metformin", "drug", 10));
//		entity.add(new MedicineEntity(114, "Amlodipine", "drug", 10));  
//		entity.add(new MedicineEntity(115, "Metoprolol", "drug", 10));
//		entity.add(new MedicineEntity(116, "Omeprazole", "drug", 10));
//		entity.add(new MedicineEntity(117, "Simvastatin", "drug", 10));  
//		entity.add(new MedicineEntity(118, "Losartan", "drug", 10));
//		entity.add(new MedicineEntity(119, "Albuterol", "drug", 10));
//		entity.add(new MedicineEntity(120, "Lisinopril", "drug", 10));  
//		entity.add(new MedicineEntity(121, "Atorvastatin", "drug", 10));
//		entity.add(new MedicineEntity(122, "Levothyroxine", "drug", 10));
//		entity.add(new MedicineEntity(133, "Metformin", "drug", 10));  
//		entity.add(new MedicineEntity(134, "Amlodipine", "drug", 10));
//		entity.add(new MedicineEntity(135, "Metoprolol", "drug", 10));
//		entity.add(new MedicineEntity(136, "Omeprazole", "drug", 10));  
//		entity.add(new MedicineEntity(137, "Simvastatin", "drug", 10));
//		entity.add(new MedicineEntity(138, "Losartan", "drug", 10));
//		entity.add(new MedicineEntity(139, "Albuterol", "drug", 10));  
//		entity.add(new MedicineEntity(140, "Antacids", "drug", 10));
//		entity.add(new MedicineEntity(141, "Hydrocortisone ", "drug", 10));
//		entity.add(new MedicineEntity(142, "Antiseptic ", "drug", 10));  
//		entity.add(new MedicineEntity(143, "dolo650", "drug", 10));
//		entity.add(new MedicineEntity(144, "dolo650", "drug", 10));
		MedicineDAO dao=new MedicineDAOImpl();
		dao.putAll(entity);

//		//entity = new MedicineEntity(11, "dolo650", "drug", 10);
//		MedicineEntity entity1 = new MedicineEntity(22, "paracitamol", "drug", 10);
//		MedicineEntity entity2 = new MedicineEntity(33, "dolo650", "drug", 10);
//		MedicineEntity entity3 = new MedicineEntity(44, "paracitamol", "drug", 10);
//		MedicineEntity entity4 = new MedicineEntity(55, "dolo650", "drug", 10);
//		MedicineEntity entity5 = new MedicineEntity(66, "paracitamol", "drug", 10);
//		MedicineEntity entity6 = new MedicineEntity(77, "dolo650", "drug", 10);
//		MedicineEntity entity7 = new MedicineEntity(88, "paracitamol", "drug", 10);
//		MedicineEntity entity8= new MedicineEntity(99, "dolo650", "drug", 10);
//		MedicineEntity entity9 = new MedicineEntity(100, "paracitamol", "drug", 10);
//		MedicineEntity entity10= new MedicineEntity(111, "dolo650", "drug", 10);
//		MedicineEntity entity11 = new MedicineEntity(222, "paracitamol", "drug", 10);
//		MedicineEntity entity12= new MedicineEntity(333, "dolo650", "drug", 10);
//		MedicineEntity entity13 = new MedicineEntity(444, "paracitamol", "drug", 10);
//		MedicineEntity entity14 = new MedicineEntity(555, "dolo650", "drug", 10);
//		MedicineEntity entity15 = new MedicineEntity(666, "paracitamol", "drug", 10);
//		MedicineEntity entity16 = new MedicineEntity(777, "dolo650", "drug", 10);
//		MedicineEntity entity17 = new MedicineEntity(888, "paracitamol", "drug", 10);
//		MedicineEntity entity18 = new MedicineEntity(999, "dolo650", "drug", 10);
//		MedicineEntity entity19 = new MedicineEntity(1000, "paracitamol", "drug", 10);
//		MedicineEntity entity20 = new MedicineEntity(101, "dolo650", "drug", 10);
//		MedicineEntity entity21 = new MedicineEntity(102, "paracitamol", "drug", 10);
//		MedicineEntity entity22 = new MedicineEntity(103, "dolo650", "drug", 10);
//		MedicineEntity entity23 = new MedicineEntity(104, "paracitamol", "drug", 10);
//		MedicineEntity entit24 = new MedicineEntity(105, "dolo650", "drug", 10);
//		MedicineEntity entity25 = new MedicineEntity(106, "paracitamol", "drug", 10);
//		MedicineEntity entity26 = new MedicineEntity(107, "dolo650", "drug", 10);
//		MedicineEntity entity27 = new MedicineEntity(108, "paracitamol", "drug", 10);
//		MedicineEntity entity28 = new MedicineEntity(109, "dolo650", "drug", 10);
//		MedicineEntity entity29 = new MedicineEntity(110, "paracitamol", "drug", 10);
//		MedicineEntity entity30 = new MedicineEntity(112, "dolo650", "drug", 10);
//		MedicineEntity entity31 = new MedicineEntity(113, "paracitamol", "drug", 10);
//		MedicineEntity entity32 = new MedicineEntity(114, "dolo650", "drug", 10);
//		MedicineEntity entity33 = new MedicineEntity(115, "paracitamol", "drug", 10);
//		//MedicineDAO dao = new MedicineDAOImpl();
//		//dao.put(entity);
//		//dao.put(entity1);
	}

}
