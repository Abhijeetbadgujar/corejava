package com.xworkz.bridge.VotingRules.DAO;

public class AmezonCartDAO {
	ArrayAmazonCartDAO arrayAmazonCartDAO;

	public AmezonCartDAO(ArrayAmazonCartDAO arrayAmazonCartDAO) {
		super();
		this.arrayAmazonCartDAO = arrayAmazonCartDAO;
	}

	public void saveCartDAO(CartDTO cart) {
		if (cart != null) {
			boolean cart1 = arrayAmazonCartDAO.save(cart);
			if (cart1) {
				System.out.println("invoked the save method in arrayAmazonCartDAO");
				System.out.println("`````````````````````````");

			} else {
				System.err.println("not invoked the save method in arrayAmzonCartDAO");
			}
		}else {
			System.err.println("cart in null");
			
		}
		
	}

	

	public void arrayFindByName(CartDTO cart) {
		if(cart!=null) {
			CartDTO cart2=arrayAmazonCartDAO.findByName(cart.getName());
			if(cart2!=null) {
				System.out.println("invoked the find method in arrayAmazonCartDAO");
				System.out.println("------------------------");
			}else {
				System.out.println("not invoked the find method in arrayAmazonCartDAO");
			}
		}else {
			System.err.println("cart is not converting to cartDTO to boolean");
		}
	}
	public void displaydetails() {
		if(arrayAmazonCartDAO!=null) {
			arrayAmazonCartDAO.displayAllCartDetails();
		}
	}
	

}
