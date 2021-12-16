package com.xworkz.methods.collectionEnheritet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class countryDAO {

	Collection<String> collect = new ArrayList<String>();

	public boolean find(String obj) {
		return this.collect.add(obj);
	}

	public boolean contain(String name) {
		Iterator<String> iterator = collect.iterator();
		while (iterator.hasNext()) {
			String ref = iterator.next();
			if (name.equals(ref)) {
				return true;
			}
		}
		return false;
	}

	public boolean caseSensitive(String obj) {
		Iterator<String> iterator1 = collect.iterator();
		while (iterator1.hasNext()) {
			String ref1 = iterator1.next();
			if (obj.equalsIgnoreCase(ref1)) {
				return true;
			}
		}
		return false;
	}

	public boolean startswith(String start) {
		Iterator<String> iterator2 = collect.iterator();
		while (iterator2.hasNext()) {
			String ref2 = iterator2.next();
			if (ref2.toUpperCase().startsWith(start.toUpperCase())) {
				return true;

			}
		}
		return false;
	}
	public boolean endswith(String end) {
		Iterator<String> iterator3=collect.iterator();
		while(iterator3.hasNext()) {
			String ref3=iterator3.next();
			if(ref3.toLowerCase().endsWith(end)) {
				return true;
			}
		}
		return false;
	}

}
