package com.xworkz.dto;

public class ApplicationDTO {
	private String name;
	private String company;
	private String version;
	private String founder;
	//private int totalUsers;
	//private String serverLocation;
	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}
	public ApplicationDTO(String name, String company, String version, String founder) {
		super();
		this.name = name;
		this.company = company;
		this.version = version;
		this.founder = founder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	
}
