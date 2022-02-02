package com.xworkz.vendor.dao;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorDao {
	
	public void save(VendorEntity entity);
	
	boolean findLogin(String loginName,String password);
	
	boolean findByEmail(String email);
	
	boolean updatePasswordByEmail(String email,String password);

}
