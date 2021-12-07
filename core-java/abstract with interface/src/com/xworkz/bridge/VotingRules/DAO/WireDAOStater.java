package com.xworkz.bridge.VotingRules.DAO;

public class WireDAOStater {

	public static void main(String[] args) {

		WireDAO dao=new WireDAO("Sterlite2.0", 400, 333.3f, 2500);
		dao.getBrand();
	}

}
