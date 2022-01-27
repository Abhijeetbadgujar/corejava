package com.xworkz.register.service;

import com.xworkz.register.Entity.RegisterEntity;
import com.xworkz.register.dao.RegisterDao;

public class ServiceDaoImpl implements Service {

	private RegisterDao dao;

	public ServiceDaoImpl(RegisterDao registerDao) {
		this.dao = registerDao;
	}

	@Override
	public boolean validataAndSave(RegisterEntity registerEntity) {
		boolean valid = true;
		System.out.println("invoked valid and save");
		if ((registerEntity.getUserName() != null && registerEntity.getUserName().length() >= 6)
				&& registerEntity.getUserName().length() <= 25) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(registerEntity.getUserName().length());
			valid = false;
			return valid;
		}

		if ((registerEntity.getPassword() != null && registerEntity.getPassword().length() >= 6)
				&& registerEntity.getPassword().length() <= 36) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(registerEntity.getPassword().length());
			valid = false;
			return valid;
		}

		if (String.valueOf(registerEntity.getMobileNo()).length() == 10) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			valid = false;
			return valid;
		}

		if ((registerEntity.getCity() != null && registerEntity.getCity().length() >= 3)
				&& registerEntity.getCity().length() <= 56) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(registerEntity.getCity().length());
			valid = false;
			return valid;
		}

		if ((registerEntity.getPassword() != null && registerEntity.getPassword().length() >= 3)
				&& registerEntity.getPassword().length() <= 56) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(registerEntity.getPassword().length());
			valid = false;
			return valid;
		}
		if (valid) {
			System.out.println("valid calling dao save");
			dao.save(registerEntity);

		}
		return valid;
	}

}
