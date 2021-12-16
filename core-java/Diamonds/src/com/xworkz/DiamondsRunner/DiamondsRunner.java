package com.xworkz.DiamondsRunner;

import com.xworkz.DiamondsRunner.Shops.Shops;
import com.xworkz.DiamondsRunner.Shops.Brand.Brand;

public class DiamondsRunner {

	public static void main(String[] args) {

		class Mine {
			private String location;
		}
		Mine mine = new Mine();
		System.out.println(mine.location);

		Shops shop = new Shops();
		System.out.println(shop.shopName);

		Brand brand = new Brand();
		System.out.println(brand.diamondBrands);
	}

}
