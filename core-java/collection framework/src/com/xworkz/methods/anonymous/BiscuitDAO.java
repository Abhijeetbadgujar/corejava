package com.xworkz.methods.anonymous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BiscuitDAO {
	
	private Collection<String> collection=new ArrayList<String>();
	
	public BiscuitDAO() {
		collection.add("parle");
		collection.add("50-50");
		collection.add("borbon");
		collection.add("monaco");
	}
	public boolean operation(BiscuitSearch searchElement, String value) {
		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext()) {
			String ref=iterator.next();
			if(searchElement.expression(ref, value)) {
				return true;
			}
		}
		return false;
	}
	
}
