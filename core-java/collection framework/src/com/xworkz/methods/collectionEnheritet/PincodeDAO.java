package com.xworkz.methods.collectionEnheritet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PincodeDAO {

	Collection<String> collection = new ArrayList<String>();

	public boolean find(String obj) {
		return this.collection.add(obj);
	}

	public boolean save(String code) {
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String interger = iterator.next();
			if (code.equals(interger))
				;
			return true;
		}
		return false;
	}

	public boolean caseSensitive(String chars) {
		Iterator<String> iterator1 = collection.iterator();
		while (iterator1.hasNext()) {
			String integer1 = iterator1.next();
			if (chars.equals(integer1))
				return true;
		}
		return false;
	}

	public boolean startWith(String start) {
		Iterator<String> iterator2 = collection.iterator();
		while (iterator2.hasNext()) {
			String integer2 = iterator2.next();
			if (start.endsWith(integer2))
				return true;
		}
		return false;
	}

	public boolean endWith(String end) {
		Iterator<String> iterator3 = collection.iterator();
		while (iterator3.hasNext()) {
			String interger3 = iterator3.next();
			if (end.endsWith(interger3))
				return true;
		}
		return false;
	}
}
