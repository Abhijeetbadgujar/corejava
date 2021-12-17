package com.xworkz.methods.anonymous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PaintDAO {
	
	private Collection<String> collection=new ArrayList<String>();
	
	public PaintDAO() {
		collection.add("nerolux");
		collection.add("delux");
		collection.add("ascient");
	}
	public boolean operation(PaintSearch searchElement,String value) {
		Iterator<String> iterator=collection.iterator();
		while (iterator.hasNext()) {
			String point =iterator.next();
			if(searchElement.expression(point,value)) {
				return true;
			}
		}
		return false;
	}
}
