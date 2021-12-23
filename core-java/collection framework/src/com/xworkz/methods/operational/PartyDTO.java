package com.xworkz.methods.operational;

public class PartyDTO {
	private int id;
	private P_Name name;
	private String president;
	private int totoalMember;
	private String foundedBy;
	public PartyDTO(int id, P_Name name, String president, int totoalMember, String foundedBy) {
		super();
		this.id = id;
		this.name = name;
		this.president = president;
		this.totoalMember = totoalMember;
		this.foundedBy = foundedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public P_Name getName() {
		return name;
	}
	public void setName(P_Name name) {
		this.name = name;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public int getTotoalMember() {
		return totoalMember;
	}
	public void setTotoalMember(int totoalMember) {
		this.totoalMember = totoalMember;
	}
	public String getFoundedBy() {
		return foundedBy;
	}
	public void setFoundedBy(String foundedBy) {
		this.foundedBy = foundedBy;
	}
	@Override
	public String toString() {
		return "PartyDTO [id=" + id + ", name=" + name + ", president=" + president + ", totoalMember=" + totoalMember
				+ ", foundedBy=" + foundedBy + "]";
	}
	
}
