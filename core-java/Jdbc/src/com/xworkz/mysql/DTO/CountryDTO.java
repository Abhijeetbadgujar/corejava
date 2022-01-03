package com.xworkz.mysql.DTO;

public class CountryDTO {
	private int cid, ccode;
	private String cname,continent;
	public CountryDTO(int cid, int ccode, String cname, String continent) {
		super();
		this.cid = cid;
		this.ccode = ccode;
		this.cname = cname;
		this.continent = continent;
	}
	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "CountryDTO [cid=" + cid + ", ccode=" + ccode + ", cname=" + cname + ", continent=" + continent + "]";
	}
}
