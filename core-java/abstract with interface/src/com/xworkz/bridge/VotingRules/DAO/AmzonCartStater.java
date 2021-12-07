package com.xworkz.bridge.VotingRules.DAO;

public class AmzonCartStater {

	public static void main(String[] args) {
		
		CartDTO cartDTO=new CartDTO("varsha",2,2000.3f,"headphone");
		ArrayAmazonCartDAO amazonCartDAO= new ArrayAmazonCartDAO();
		//AmzonCartDAO amazonCartDAO= new ArrayAmazonCartDAO();

		AmezonCartDAO amezonCartDAO=new AmezonCartDAO(amazonCartDAO);		
		
		amezonCartDAO.saveCartDAO(cartDTO);
		amezonCartDAO.arrayFindByName(null);
		amezonCartDAO.displaydetails();
	}

}
