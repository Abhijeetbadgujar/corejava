package com.xworkz.passport.services;

import com.xworkz.passport.entity.PassportEntity;

public interface PassportServicesDao {

	public boolean saveAndValidate(PassportEntity entity);
}
