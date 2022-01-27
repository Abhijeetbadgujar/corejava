package com.xworkz.vendor.stater;

import java.time.LocalDateTime;

import com.xworkz.register.service.Service;
import com.xworkz.register.service.ServiceImpl;
import com.xworkz.vendor.dao.VendorDao;
import com.xworkz.vendor.dao.VendorDaoImpl;
import com.xworkz.vendor.entity.VendorEntity;

public class vendorStater {

	public static void main(String[] args) {

		VendorEntity entity=new VendorEntity( "volvo", "www.volvo@143.gmail.com", "Abhijeet", "125434", "4 block, ramesh nager, jatwada road", "Abhijeet12345","abhijeet",LocalDateTime.now(),"abhi501", LocalDateTime.now());
		
		VendorDao dao=new VendorDaoImpl();
		
		Service serviceDaos=new ServiceImpl(dao);
		serviceDaos.validataAndSave(entity);
	}

}
