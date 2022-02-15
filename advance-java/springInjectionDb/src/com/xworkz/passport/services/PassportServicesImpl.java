package com.xworkz.passport.services;

import java.time.Instant;
import java.time.chrono.ChronoLocalDateTime;
import java.util.regex.Pattern;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.passportDao.PassportDao;

public class PassportServicesImpl implements PassportServicesDao {

	private PassportDao dao;
	// private ChronoLocalDateTime<?> StartTime;
	// private ChronoLocalDateTime<?> endTime;
	String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])";

	public PassportServicesImpl(PassportDao passportDao) {
		this.dao = passportDao;
	}

	@Override
	public boolean saveAndValidate(PassportEntity entity) {
		boolean valid = true;
		if (entity.getIssuedBy() != null && !entity.getIssuedBy().isEmpty() && entity.getIssuedBy().length() >= 3
				&& entity.getIssuedBy().length() <= 135) {
			System.out.println(entity.getIssuedBy());
			valid = true;
			
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getIssuedBy().length());
			valid = false;
			return valid;
		}

		if (entity.getIssuedAt() != null /* && entity.getIssuedAt().isBefore(StartTime) */) {
			System.out.println(entity.getIssuedAt());
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getIssuedAt());
			valid = false;
			return valid;
		}

		if (entity.getExpiresAt() != null && entity.getExpiresAt().isAfter(entity.getIssuedAt().plusYears(10))) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getIssuedAt());
			valid = false;
			return valid;
		}

		if (entity.getGender() != null) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getGender());
			valid = true;
			return valid;
		}

		/*
		 * if (entity.getPassportNO() != null && !entity.getPassportNO().isEmpty() &&
		 * entity.getPassportNO().length() == 8 &&
		 * entity.getPassportNO().toUpperCase().startsWith("A") &&
		 * entity.getPassportNO().valueOf(2).length() >= 0 ||
		 * entity.getPassportNO().valueOf(2).length() <= 9 &&
		 * entity.getPassportNO().valueOf(3).length() >= 0 ||
		 * entity.getPassportNO().valueOf(3).length() <= 9)
		 */

		if (entity.getPassportNO() == null && !entity.getPassportNO().isEmpty() && entity.getPassportNO().length() == 8
				&& entity.getPassportNO().toUpperCase().startsWith("A")) {

			Pattern pattern = Pattern.compile(regex);
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getPassportNO());
			valid = false;
			return valid;
		}

		if (entity.getAddress() != null && !entity.getAddress().isEmpty() && entity.getAddress().length() >= 20
				&& entity.getAddress().length() <= 200) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getAddress());
			valid = false;
			return valid;
		}

		if (entity.getLegelIssue() != null) {
			valid = false;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getLegelIssue());
			valid = true;
			return valid;
		}

		if (entity.getPassportPersonalType() != null) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getLegelIssue());
			valid = false;
			return valid;
		}

		if (entity.getDob() != null && entity.getDob().isBefore(entity.getDob().minusYears(9))) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getDob());
			valid = false;
			return valid;
		}

		if (entity.getBloodGroup() != null) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getBloodGroup());
			valid = false;
			return valid;
		}

		if (entity.getVerifiedDocument() != null) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			System.out.println(entity.getVerifiedDocument());
			valid = false;
			return valid;
		}
		return false;

	}

}
