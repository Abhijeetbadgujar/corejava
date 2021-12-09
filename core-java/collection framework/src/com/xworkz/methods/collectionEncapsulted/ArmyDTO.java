package com.xworkz.methods.collectionEncapsulted;

public class ArmyDTO {
	private String country,colourCode;
	private int noOfSolgar,noOfMiltry;
	public ArmyDTO(String country, String colourCode, int noOfSolgar, int noOfMiltry) {
		super();
		this.country = country;
		this.colourCode = colourCode;
		this.noOfSolgar = noOfSolgar;
		this.noOfMiltry = noOfMiltry;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getColourCode() {
		return colourCode;
	}
	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}
	public int getNoOfSolgar() {
		return noOfSolgar;
	}
	public void setNoOfSolgar(int noOfSolgar) {
		this.noOfSolgar = noOfSolgar;
	}
	public int getNoOfMiltry() {
		return noOfMiltry;
	}
	public void setNoOfMiltry(int noOfMiltry) {
		this.noOfMiltry = noOfMiltry;
	}
	@Override
	public String toString() {
		return "ArmyDTO [country=" + country + ", colourCode=" + colourCode + ", noOfSolgar=" + noOfSolgar
				+ ", noOfMiltry=" + noOfMiltry + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 34;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ArmyDTO) {
				ArmyDTO casted=(ArmyDTO)obj;
				if(this.colourCode.equals(casted.colourCode) && this.country.equals(casted.country)) {
					return true;
				}
			}
		}
		return false;
	}
}
