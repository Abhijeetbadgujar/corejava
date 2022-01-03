package com.xworkz.mysql.DTO;

public class CityDTO {
	private int cid;
	private String cName,famousFor;
	private long cPopulation;
	public CityDTO(int cid, String cName, String famousFor, long cPopulation) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.famousFor = famousFor;
		this.cPopulation = cPopulation;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	public long getcPopulation() {
		return cPopulation;
	}
	public void setcPopulation(long cPopulation) {
		this.cPopulation = cPopulation;
	}
	@Override
	public String toString() {
		return "CityDTO [cid=" + cid + ", cName=" + cName + ", famousFor=" + famousFor + ", cPopulation=" + cPopulation
				+ "]";
	}
	
}
