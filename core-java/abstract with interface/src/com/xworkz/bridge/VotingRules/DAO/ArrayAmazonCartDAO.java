package com.xworkz.bridge.VotingRules.DAO;

public class ArrayAmazonCartDAO implements AmzonCartDAO {
	private CartDTO[] dtos = new CartDTO[10];
	private int counter = 0;

	public ArrayAmazonCartDAO() {
		System.out.println("invoked no-arg ArrayAmazonCart constructor");
	}

	
	public boolean save(CartDTO cartDTO) {
		if (counter < this.dtos.length && cartDTO != null) {
			this.dtos[counter] = cartDTO;
			System.out.println("save the CartDTO Name :" + cartDTO.getName());
			return true;
		}
		return false;
	}

	
	public CartDTO findByName(String name) {
		if (name != null) {
			for (int x = 0; x <= this.dtos.length; x++) {
				CartDTO ref = this.dtos[x];
				String ref1 = ref.getName();
				System.out.println("items name:" + ref1);
				if (ref.equals(ref1)) {
					System.out.println("both the address is matching");
					return dtos[x];
				}
			}
		}

		return null;
	}

	
	public void displayAllCartDetails() {
		if (dtos != null) {
			System.out.println("display the allcartDetails");
			for (int i = 0; i < this.dtos.length; i++) {
				CartDTO cartDTO = this.dtos[i];
				if(cartDTO!=null) {
				System.out.println(cartDTO.getName());
				System.out.println(cartDTO.getItems());
				System.out.println(cartDTO.getPrice());
				System.out.println(cartDTO.getQuantity());
				}
			}
		}
	}
}
