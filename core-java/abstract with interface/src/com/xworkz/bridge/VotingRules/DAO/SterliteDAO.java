package com.xworkz.bridge.VotingRules.DAO;

public interface SterliteDAO {
	boolean save(WireDAO wireDAO);
	WireDAO findByBrand(String brand);
	void displayDetails();
	
}
