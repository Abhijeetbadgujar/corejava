package com.xworkz.methods.collectionEncapsulted;

public class PolicStationDTO {
	
	private String location,name,type;
	private int noOfstaffs;
	
	public PolicStationDTO(String location, String name, String type, int noOfstaffs) {
		super();
		this.location = location;
		this.name = name;
		this.type = type;
		this.noOfstaffs = noOfstaffs;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfstaffs() {
		return noOfstaffs;
	}
	public void setNoOfstaffs(int noOfstaffs) {
		this.noOfstaffs = noOfstaffs;
	}
	@Override
	public String toString() {
		return "PolicStationDTO [location=" + location + ", name=" + name + ", type=" + type + ", noOfstaffs="
				+ noOfstaffs + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 45;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PolicStationDTO) {
				PolicStationDTO cast=(PolicStationDTO)obj;
				if(this.name.equals(cast.name) && this.location.equals(cast.location)) {
					System.out.println("it is equal");
					return true;
				}
			}
		}
		return false;
	}
	
	
}
