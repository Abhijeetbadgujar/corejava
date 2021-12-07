package com.xworkz.DTO;

public class IPLDTO {
	
	int noOfTeams;
	int noOfcoutch;
	String owner;
	String sponcer;
	
	public IPLDTO() {
		System.out.println("invoked the no-paramerterized constructor");
	}

	public IPLDTO(int noOfTeams, int noOfcoutch, String owner, String sponcer) {
		super();
		this.noOfTeams = noOfTeams;
		this.noOfcoutch = noOfcoutch;
		this.owner = owner;
		this.sponcer = sponcer;
	}

	public int getNoOfTeams() {
		return noOfTeams;
	}

	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}

	public int getNoOfcoutch() {
		return noOfcoutch;
	}

	public void setNoOfcoutch(int noOfcoutch) {
		this.noOfcoutch = noOfcoutch;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponcer() {
		return sponcer;
	}

	public void setSponcer(String sponcer) {
		this.sponcer = sponcer;
	}
	
	
}
