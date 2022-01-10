package com.xworkz.world.dao;

import com.xworkz.world.entity.PatientEntity;

public class PatientStater {

	public static void main(String[] args) {

		PatientEntity patientEntity=new PatientEntity(12, "gomu", "23dec", "high-level",23, 176);
		PatientEntity patientEntity1=new PatientEntity(13, "amol", "26dec", "medium-level",23, 177);
		PatientEntity patientEntity2=new PatientEntity(14, "sachin", "23jan", "lower-level",23, 17);
		PatientEntity patientEntity3=new PatientEntity(15, "atharv", "22nov", "high-level",23, 1764);
		PatientEntity patientEntity4=new PatientEntity(16, "shailesh", "21feb", "high-level",23, 1726);
		PatientInterface patientInterface=new PatientDAOImple();
//		patientInterface.create(patientEntity);
//		patientInterface.create(patientEntity1);
//		patientInterface.create(patientEntity2);
//		patientInterface.create(patientEntity3);
//		patientInterface.create(patientEntity4);
		PatientEntity pEntity= patientInterface.getById(12);
		System.out.println(pEntity);
//		patientInterface.updatePatientEntity("10jan", 14);
		patientInterface.delete(16);
	}

}
