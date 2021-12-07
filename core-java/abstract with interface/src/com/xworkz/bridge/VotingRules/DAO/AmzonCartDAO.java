package com.xworkz.bridge.VotingRules.DAO;

public interface AmzonCartDAO {
	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	void displayAllCartDetails();
}
