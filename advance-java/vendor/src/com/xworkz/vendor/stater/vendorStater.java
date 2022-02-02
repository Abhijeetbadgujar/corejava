package com.xworkz.vendor.stater;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDao;
import com.xworkz.vendor.dao.VendorDaoImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.Service;
import com.xworkz.vendor.service.ServiceImpl;

public class vendorStater {

	public static void main(String[] args) {

		VendorEntity entity=new VendorEntity( "volvo", "www.volvo@143.gmail.com", "Abhijeet", "125434", "4 block, ramesh nager, jatwada road", "Abhijeet12345","abhijeet",LocalDateTime.now(),"abhi501", LocalDateTime.now());
		VendorEntity entity1=new VendorEntity( "mercury", "www.mercury@178.gmail.com", "newton", "125434", "5 block, apple nager, MG road ", "Newton1234567","NewtonFather",LocalDateTime.now(),"New1432", LocalDateTime.now());

		VendorDao dao=new VendorDaoImpl();
		
		Service serviceDaos=new ServiceImpl(dao);
		serviceDaos.validataAndSave(entity1);
	}

}
