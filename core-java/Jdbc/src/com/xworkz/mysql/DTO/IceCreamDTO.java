package com.xworkz.mysql.DTO;

public class IceCreamDTO {
	private int creamid,cPrice;
	private String cFlavour,cName;
	public IceCreamDTO(int creamid, int cPrice, String cFlavour, String cName) {
		super();
		this.creamid = creamid;
		this.cPrice = cPrice;
		this.cFlavour = cFlavour;
		this.cName = cName;
	}
	public int getCreamid() {
		return creamid;
	}
	public void setCreamid(int creamid) {
		this.creamid = creamid;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	public String getcFlavour() {
		return cFlavour;
	}
	public void setcFlavour(String cFlavour) {
		this.cFlavour = cFlavour;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "IceCreamDTO [creamid=" + creamid + ", cPrice=" + cPrice + ", cFlavour=" + cFlavour + ", cName=" + cName
				+ "]";
	}
}
