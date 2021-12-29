package com.xworkz.methods.keyAndValues;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class NameAndTotalmembers {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("college",20);
		map.put("movie",10);
		map.put("festival",12);
		map.put("trakking",6);
		
		System.out.println("read only key...");
		Set<String> set=map.keySet(); 
		set.stream().sorted().forEach(u->System.out.println(u));
		System.out.println("---------------------");
		
		System.out.println("read only value...");
		Collection<Integer> set2=map.values();
		set2.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
		System.out.println("---------------------");
		
		System.out.println("read key and value");
		Set<Map.Entry<String, Integer>> set3=map.entrySet();
		Iterator<Map.Entry<String,Integer>> iterator=set3.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String,Integer> entry=iterator.next();
			System.out.println(entry.getKey()+"="+(entry.getValue()));
		}
		System.out.println("---------------------");
		
		System.out.println("read key and value using stream");
		set3.stream().forEach(y->System.out.println(y));
		
	}

}
