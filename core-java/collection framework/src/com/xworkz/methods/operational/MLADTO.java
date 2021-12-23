package com.xworkz.methods.operational;

import java.io.Serializable;

public class MLADTO implements Serializable {
	private int id;
	private MLADTOName name;
	private String constituency;
	private int totalAssect;
	private String foundedBy;
	public MLADTO(int id, MLADTOName name, String constituency, int totalAssect, String foundedBy) {
		super();
		this.id = id;
		this.name = name;
		this.constituency = constituency;
		this.totalAssect = totalAssect;
		this.foundedBy = foundedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MLADTOName getName() {
		return name;
	}
	public void setName(MLADTOName name) {
		this.name = name;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public int getTotalAssect() {
		return totalAssect;
	}
	public void setTotalAssect(int totalAssect) {
		this.totalAssect = totalAssect;
	}
	public String getFoundedBy() {
		return foundedBy;
	}
	public void setFoundedBy(String foundedBy) {
		this.foundedBy = foundedBy;
	}
	@Override
	public String toString() {
		return "MLADTO [id=" + id + ", name=" + name + ", constituency=" + constituency + ", totalAssect=" + totalAssect
				+ ", foundedBy=" + foundedBy + "]";
	}
	
	
}
