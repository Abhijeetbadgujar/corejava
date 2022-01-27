package com.xworkz.vendor.service;

import com.xworkz.vendor.dao.VendorDao;
import com.xworkz.vendor.entity.VendorEntity;

public class ServiceImpl implements Service {

	private VendorDao dao;

	public ServiceImpl(VendorDao vendoDao) {
		this.dao = vendoDao;
	}

	@Override
	public boolean validataAndSave(VendorEntity vendorEntity) {
		boolean valid = true;
		System.out.println("invoked valid and save");
		if ((vendorEntity.getUserName() != null && vendorEntity.getUserName().length() >= 5)
				&& vendorEntity.getUserName().length() <= 30 && !(vendorEntity.getUserName().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(vendorEntity.getUserName().length());
			valid = false;
			return valid;
		}

		if ((vendorEntity.getEmail() != null && vendorEntity.getEmail().contains("@")
				&& vendorEntity.getEmail().endsWith(".com")) && !(vendorEntity.getEmail().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(vendorEntity.getUserName().length());
			valid = false;
			return valid;
		}

		if ((vendorEntity.getLoginName() != null && vendorEntity.getLoginName().length() >= 8)
				&& vendorEntity.getLoginName().length() <= 12 && !(vendorEntity.getLoginName().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(vendorEntity.getPassword().length());
			valid = false;
			return valid;
		}

		if ((vendorEntity.getAddress() != null && vendorEntity.getAddress().length() >= 30)
				&& vendorEntity.getAddress().length() <= 100 && !(vendorEntity.getAddress().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(vendorEntity.getPassword().length());
			valid = false;
			return valid;
		}
		
		if (String.valueOf(vendorEntity.getGstNo()).length() == 13 && vendorEntity.getLoginName() != null
				&& !(vendorEntity.getLoginName().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			valid = false;
			return valid;
		}

		if ((vendorEntity.getCreatedBy() != null && vendorEntity.getCreatedBy().length() >= 5)
				&& vendorEntity.getCreatedBy().length() <= 30 && !(vendorEntity.getCreatedBy().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(vendorEntity.getUserName().length());
			valid = false;
			return valid;
		}

		if ((vendorEntity.getUpdatedBy() != null && vendorEntity.getUpdatedBy().length() >= 5)
				&& vendorEntity.getUpdatedBy().length() <= 30 && !(vendorEntity.getUpdatedBy().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(vendorEntity.getUserName().length());
			valid = false;
			return valid;
		}



		if (valid) {
			System.out.println("valid calling dao save");
			dao.save(vendorEntity);

		}
		return valid;
	}

}
