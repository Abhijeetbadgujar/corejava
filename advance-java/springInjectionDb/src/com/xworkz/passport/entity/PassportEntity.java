package com.xworkz.passport.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.xworkz.passport.entity.constant.BloodGroup;
import com.xworkz.passport.entity.constant.Gender;
import com.xworkz.passport.entity.constant.PassportPersonalType;
import com.xworkz.passport.entity.constant.VerifiedDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PassportEntity {
	
	

	private int id;
	private String issuedBy;
	private LocalDateTime issuedAt;
	private LocalDateTime expiresAt;
	private Gender gender;
	private String PassportNO;
	private String address;
	private String fullname;
	private String legelIssue;
	private PassportPersonalType passportPersonalType;
	private LocalDateTime dob;
	private BloodGroup bloodGroup;
	private VerifiedDocument verifiedDocument;
	
}
