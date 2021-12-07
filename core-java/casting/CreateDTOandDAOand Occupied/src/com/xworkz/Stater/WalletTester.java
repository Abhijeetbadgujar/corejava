package com.xworkz.Stater;

import com.xworkz.DTO.WalletDAO;
import com.xworkz.DTO.WalletDTO;

public class WalletTester {

	public static void main(String[] args) {

		WalletDTO walletdto = new WalletDTO("systax", "leather", 6, 200, 3);
		WalletDTO walletdto1 = new WalletDTO("lakxmi", "leather", 6, 200, 3);
		WalletDTO walletdto2 = new WalletDTO("root", "leather", 6, 200, 3);
		WalletDTO walletdto3 = new WalletDTO("", "leather", 6, 200, 3);

		// WalletDTO wall=walletdto.getCompany();
		WalletDAO wall = new WalletDAO();
		wall.create(walletdto1);

		wall.create(new WalletDTO("sys", "plastic", 10, 200, 3),4);
		wall.IndexOccupied();
		wall.matchTerm("plastic");
		System.out.println("----------------------");

		WalletDTO[] array = wall.getDtos();

		for (int arr = 0; arr < array.length; arr++) {
			WalletDTO result = array[arr];
			
			if(result!=null) {
				System.out.println("name of the company:"+result.getCompany());
				System.out.println("name of material".concat(String.valueOf(result.getMaterial())));
			}
		}

	}
}
