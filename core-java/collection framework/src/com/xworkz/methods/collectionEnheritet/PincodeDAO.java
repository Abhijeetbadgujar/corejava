package com.xworkz.methods.collectionEnheritet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PincodeDAO {

	Collection<Integer> collection = new ArrayList<Integer>();

	public boolean find(int obj) {
		return this.collection.add(obj);
	}

	public boolean save(int code) {
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Integer interger = iterator.next();
			if (code==(interger)) {
			return true;
			}
		}
		return false;
	}

	public boolean caseSensitive(int chars) {
		Iterator<Integer> iterator1 = collection.iterator();
		while (iterator1.hasNext()) {
			Integer integer1 = iterator1.next();
			if (chars==(integer1))
				return true;
		}
		return false;
	}

	public boolean startWith(int start) {
		Iterator<Integer> iterator2 = collection.iterator();
		while (iterator2.hasNext()) {
			Integer integer2 = iterator2.next();
			if (start==(integer2))
				return true;
		}
		return false;
	}

	public boolean endWith(int end) {
		Iterator<Integer> iterator3 = collection.iterator();
		while (iterator3.hasNext()) {
			Integer interger3 = iterator3.next();
			if (end==(interger3))
				return true;
		}
		return false;
	}
}
