package com.xworkz.vendor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vendor_detailss ")
@NamedQueries ({ @NamedQuery(name = "findLogin", query = "select vendor.loginName from VendorEntity as vendor"),
		@NamedQuery(name = "findByEmail", query = "select vendor.email from VendorEntity as vendor"),
		@NamedQuery(name = "updatePasswordByEmail", query = "select vendor")

})
public class VendorEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "v_id")
	private int id;
	@Column(name = "v_name ")
	private String userName;
	@Column(name = "v_email ")
	private String email;
	@Column(name = "v_loginName")
	private String loginName;
	@Column(name = "v_password ")
	private String password;
	@Column(name = "v_address ")
	private String address;
	@Column(name = "v_gstNo ")
	private String gstNo;
	@Column(name = "v_createdBy ")
	private String createdBy;
	@Column(name = "v_createdAt ")
	private LocalDateTime createdAt;
	@Column(name = "v_updatedBy ")
	private String updatedBy;
	@Column(name = "v_updateAt ")
	private LocalDateTime updatedAt;

	public VendorEntity(String userName, String email, String loginName, String password, String address, String gstNo,
			String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
		super();
		this.userName = userName;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
		this.address = address;
		this.gstNo = gstNo;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

}
