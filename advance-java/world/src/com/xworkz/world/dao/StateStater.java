package com.xworkz.world.dao;

import com.xworkz.world.entity.StateEntity;

public class StateStater {

	public static void main(String[] args) {

		StateEntity stateEntity=new StateEntity(11, "goa", 1, "panji");
		StateEntity stateEntity1=new StateEntity(22, "maharashta", 28, "mumbai");
		StateEntity stateEntity2=new StateEntity(33, "karnakata", 24, "bangalore");
		StateEntity stateEntity3=new StateEntity(44, "punjab", 18, "amrutsar");
		StateEntity stateEntity4=new StateEntity(55, "gujrat", 23, "gandhi nagar");
		StateInterface stateInterface=new StateDAOImple();
		stateInterface.create(stateEntity);
		stateInterface.create(stateEntity1);
		stateInterface.create(stateEntity2);
		stateInterface.create(stateEntity3);
		stateInterface.create(stateEntity4);
	}

}
