package com.xworkz.methods.collectionEncapsulted;

public class HospitalDTO {
	private String name,location;
	private int noOfEmployess,branches;
	
	public HospitalDTO(String name, String location, int noOfEmployess, int branches) {
		super();
		this.name = name;
		this.location = location;
		this.noOfEmployess = noOfEmployess;
		this.branches = branches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfEmployess() {
		return noOfEmployess;
	}
	public void setNoOfEmployess(int noOfEmployess) {
		this.noOfEmployess = noOfEmployess;
	}
	public int getBranches() {
		return branches;
	}
	public void setBranches(int branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", location=" + location + ", noOfEmployess=" + noOfEmployess
				+ ", branches=" + branches + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof HospitalDTO) {
				HospitalDTO casted=(HospitalDTO)obj;
				
				if(this.name.equals(casted.name) && this.location.equals(casted.location)) {
					return true;
				}
			}
		}
		return false;
	}
}
