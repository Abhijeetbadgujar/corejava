package com.xworkz.override;

public class Aeroplane {
	private int noOfPlane;
	private String company;
	private String gov;
	public int getNoOfPlane() {
		return noOfPlane;
	}
	public void setNoOfPlane(int noOfPlane) {
		this.noOfPlane = noOfPlane;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGov() {
		return gov;
	}
	public void setGov(String gov) {
		this.gov = gov;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked the tostring");
		return "luftansa";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked the hashcode");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Aeroplane) {
			Aeroplane casted=(Aeroplane)obj;
			String ref=casted.getCompany();
			System.out.println("the aeroplane company is :"+ref);
			if(this.company.equals(ref)) {
				System.out.println("datatype is matching...");
				return true;
			}else {
				System.err.println("datatype is mismatching");
			}
			}else {
				System.err.println("cant converting the datatype");
			}
		}else {
			System.err.println("obj is null");
		}
		return false;
	}
}
