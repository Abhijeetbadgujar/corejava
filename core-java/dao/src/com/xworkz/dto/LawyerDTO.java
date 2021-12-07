package com.xworkz.dto;

public class LawyerDTO {
	private String name;
	private String qualification;
	private String gender;
	private String courtType;
	private int caseWon;
	private int caseLost;
	private int experience;
	private int age;
	
	public LawyerDTO(String name, String qualification, String gender, String courtType, int caseWon, int caseLost,
			int experience, int age) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.gender = gender;
		this.courtType = courtType;
		this.caseWon = caseWon;
		this.caseLost = caseLost;
		this.experience = experience;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourtType() {
		return courtType;
	}
	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}
	public int getCaseWon() {
		return caseWon;
	}
	public void setCaseWon(int caseWon) {
		this.caseWon = caseWon;
	}
	public int getCaseLost() {
		return caseLost;
	}
	public void setCaseLost(int caseLost) {
		this.caseLost = caseLost;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
