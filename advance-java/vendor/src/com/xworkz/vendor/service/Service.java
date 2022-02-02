package com.xworkz.vendor.service;

import com.xworkz.vendor.entity.VendorEntity;

public interface Service {
	public boolean validataAndSave(VendorEntity vendorEntity);
	
	boolean validAndLogin(String loginName,String password);
	
	boolean validAndChangePassword(String email,String newPassword);
}
