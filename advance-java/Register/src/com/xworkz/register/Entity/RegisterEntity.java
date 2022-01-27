package com.xworkz.register.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "register_detailss ")
public class RegisterEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="r_id")
	private int id;
	@Column(name = "r_name ")
	private String userName;
	@Column(name = "r_email ")
	private String email;
	@Column(name = "r_password ")
	private String password;
	@Column(name = "r_city ")
	private String city;
	@Column(name = "r_long ")
	private long mobileNo;
	@Column(name = "r_indianCitizen ")
	private boolean indianCitizen;

	public RegisterEntity(  String userName, String email, String password, String city, long mobileNo,
			boolean indianCitizen) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.city = city;
		this.mobileNo = mobileNo;
		this.indianCitizen = indianCitizen;
	}

}
