package com.xworkz.crudoperation;

public class BankDTO {
	String id;
	String name;
	String ifsc;
	String branch;
	public BankDTO(String id, String name, String ifsc, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
