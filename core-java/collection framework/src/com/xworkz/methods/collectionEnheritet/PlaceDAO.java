package com.xworkz.methods.collectionEnheritet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlaceDAO {
	Collection<String> collect = new ArrayList<String>();

	public boolean save(String obj) {
		return this.collect.add(obj);

	}

	public boolean find(String name) {
		Iterator<String> ref = collect.iterator();
		while (ref.hasNext()) {
			String store = ref.next();
			if (store.equals(name)) {
				return true;
			}
		}
		return false;
	}

	public boolean casesencetive(String sence) {
		Iterator<String> ref1 = collect.iterator();
		while (ref1.hasNext()) {
			String sencetive = ref1.next();
			if (sencetive.equalsIgnoreCase(sence)) {
				return true;
			}
		}
		return false;
	}
	/*
	 * public boolean startwith(String start) { Iterator<String>
	 * ref2=collect.iterator(); while(ref2.hasNext()) { String statring=ref2.next();
	 * if(statring.equals(start)) { return true; } } return false; }
	 */

	public boolean startwith(String start) {
		Iterator<String> ref2 = collect.iterator();
		while (ref2.hasNext()) {
			String statring = ref2.next();
			if (statring.toUpperCase().startsWith(start.toUpperCase())) {
				System.out.println("matched");
				return true;
			}
		}
		return false;
	}

	public boolean endwith(String end) {
		Iterator<String> iterator1 = collect.iterator();
		while (iterator1.hasNext()) {
			String ending = iterator1.next();
			if (ending.toUpperCase().endsWith(ending.toUpperCase())) {
				return true;
			}
		}
		return false;
	}
	
}
