package com.xworkz.methods.anonymous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.methods.funtionInterface.BeerSearch;

public class BeerDAO {

	private Collection<String> collectionBeer = new ArrayList<String>();

	public BeerDAO() {
		collectionBeer.add("Kingfisher");
		collectionBeer.add("Tuborg");
		collectionBeer.add("Heineken");
		collectionBeer.add("Corona");
		collectionBeer.add("Budweiser");
	}

	public boolean operations(Search searchElement, String value) {
		Iterator<String> itr = collectionBeer.iterator();
		while (itr.hasNext()) {
			String point = itr.next();
			if (searchElement.expression(point, value)) {
				return true;
			}
		}
		return false;
	}

}
