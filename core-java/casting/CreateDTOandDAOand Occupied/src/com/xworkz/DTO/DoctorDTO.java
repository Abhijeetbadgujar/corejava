package com.xworkz.DTO;

public class DoctorDTO {
	String name;
	String specilization;
	String hospitalName;
	String gender;
	int salary;
	 
	public DoctorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDTO(String name, String specilization, String hospitalName, String gender, int salary) {
		super();
		this.name = name;
		this.specilization = specilization;
		this.hospitalName = hospitalName;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
