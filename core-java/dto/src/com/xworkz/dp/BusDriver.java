package com.xworkz.dp;

public class BusDriver {
	private String name;
	private String typeOfBus;
	private String typeOfDriver;
	private String busColour;
	private String experience;
	private boolean permitted;
	private boolean license;
	
	public BusDriver() {
		System.out.println("invoked by no-parameterixed constructor");
	}

	public BusDriver(String name, String typeOfBus, String typeOfDriver, String busColour, String experience,
			boolean permitted, boolean license) {
		super();
		this.name = name;
		this.typeOfBus = typeOfBus;
		this.typeOfDriver = typeOfDriver;
		this.busColour = busColour;
		this.experience = experience;
		this.permitted = permitted;
		this.license = license;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfBus() {
		return typeOfBus;
	}

	public void setTypeOfBus(String typeOfBus) {
		this.typeOfBus = typeOfBus;
	}

	public String getTypeOfDriver() {
		return typeOfDriver;
	}

	public void setTypeOfDriver(String typeOfDriver) {
		this.typeOfDriver = typeOfDriver;
	}

	public String getBusColour() {
		return busColour;
	}

	public void setBusColour(String busColour) {
		this.busColour = busColour;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public boolean isPermitted() {
		return permitted;
	}

	public void setPermitted(boolean permitted) {
		this.permitted = permitted;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	
	
}
