package com.xworkz.register.stater;

import com.xworkz.register.Entity.RegisterEntity;
import com.xworkz.register.dao.RegisterDao;
import com.xworkz.register.dao.RegisterDaoImpl;
import com.xworkz.register.service.Service;
import com.xworkz.register.service.ServiceDaoImpl;

public class RegisterStater {

	public static void main(String[] args) {

		RegisterEntity entity=new RegisterEntity( "Abhijeet", "Mafiya@143.com", "Password", "shivmoga",9133344444l, true);
		
		RegisterDao dao=new RegisterDaoImpl();
		
		Service serviceDaos=new ServiceDaoImpl(dao);
		serviceDaos.validataAndSave(entity);
	}

}
