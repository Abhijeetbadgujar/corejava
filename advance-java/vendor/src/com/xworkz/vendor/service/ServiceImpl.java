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
		boolean valid = false;
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

		if ((vendorEntity.getLoginName() != null && vendorEntity.getLoginName().length() >= 6)
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

	@Override
	public boolean validAndLogin(String loginName, String password) {
		boolean valid = false;
		System.out.println("invoked valid and login");
		if (loginName != null && (!loginName.isEmpty()) && (loginName.length() >= 4) && (loginName.length() <= 500)) {
			valid = true;
		} else {
			System.out.println("login is invalid");
			System.out.println(loginName.length());
			valid = false;
			return valid;
		}
		if (password != null && (!password.isEmpty()) && (password.length() >= 4) && (password.length() <= 500)) {
			valid = true;
		} else {
			System.out.println("login is invalid");
			System.out.println(password.length());
			valid = false;
			return valid;
		}
		if(valid) {
			valid=dao.findLogin(loginName, password);
			return valid;
		}
		return false;
	}

	@Override
	public boolean validAndChangePassword(String email, String newPassword) {
		boolean valid = false;
		System.out.println("invoked valid and login");
		if (email != null && (!email.isEmpty()) && (email.length() >= 4) && (email.length() <= 500)) {
			valid = true;
		} else {
			System.out.println("login is invalid");
			System.out.println(email.length());
			valid = false;
			return valid;
		}
		if (newPassword != null && (!newPassword.isEmpty()) && (newPassword.length() >= 4) && (newPassword.length() <= 500)) {
			valid = true;
		} else {
			System.out.println("login is invalid");
			System.out.println(newPassword.length());
			valid = false;
			return valid;
		}
		if(valid) {
			valid=dao.findLogin(email, newPassword);
			return valid;
		}
		return false;
	}

}
