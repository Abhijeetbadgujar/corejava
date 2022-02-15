package com.xworkz.passport.stater;

import java.time.LocalDateTime;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.entity.constant.BloodGroup;
import com.xworkz.passport.entity.constant.Gender;
import com.xworkz.passport.entity.constant.PassportPersonalType;
import com.xworkz.passport.entity.constant.VerifiedDocument;
import com.xworkz.passport.passportDao.PassportDao;
import com.xworkz.passport.passportDao.PassportDaoImpl;
import com.xworkz.passport.services.PassportServicesDao;
import com.xworkz.passport.services.PassportServicesImpl;

public class PassportStater {

	public static void main(String[] args) {

		PassportEntity passportEntity=new PassportEntity(1,"kattappa", LocalDateTime.now(), LocalDateTime.now(), Gender.MALE, "A1238274", "chikal thana, jalna road, aurangabad ", "Abhijeet Badgujar", "criminal",PassportPersonalType.REGULAR,LocalDateTime.now() , BloodGroup.AB_NEGATIVE, VerifiedDocument.CRIMIALRECORD);
		
		PassportDao dao=new PassportDaoImpl();
		
		PassportServicesDao servicesDao=new PassportServicesImpl(dao);
		servicesDao.saveAndValidate(passportEntity);
	}

}
