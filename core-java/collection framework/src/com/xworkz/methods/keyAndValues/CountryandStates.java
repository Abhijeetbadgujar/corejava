package com.xworkz.methods.keyAndValues;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.xworkz.methods.operational.MLADTO;

public class CountryandStates {

	public static void main(String[] args) {

		Map<String,String> countryandStates=new  HashMap<String,String>();
		countryandStates.put("south korea", "seol");
		countryandStates.put("india", "delhi");
		countryandStates.put("soudi", "kuvet");
		countryandStates.put("pakistan", "lahor");
		
		System.out.println("read only key with ascending order...");
		Set<String> set=countryandStates.keySet();
		set.stream().sorted().forEach(k->System.out.println(k));
		System.out.println("---------------------------");
		
		System.out.println("read only key with revese order...");
		Set<String> set2=countryandStates.keySet();
		set2.stream().sorted(Comparator.reverseOrder()).forEach(j->System.out.println(j));
		System.out.println("----------------------------");
	
		System.out.println("collection value...");
		Collection<String> collection=countryandStates.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach(k->System.out.println(k));
		System.out.println("----------------------------");
		
		System.out.println("Iterator through...");
		Set<Map.Entry<String, String>> set3=countryandStates.entrySet();
		Iterator<Map.Entry<String,String>> iterator=set3.iterator();
		while(iterator.hasNext()) {
		Map.Entry<String, String> element=iterator.next();
		System.out.println(element.getKey()+(element.getValue()));
		}
		System.out.println("----------------------------");
		
		System.out.println("read for each method...");
		set3.stream().forEach(t->System.out.println(t));
		System.out.println("----------------------------");
		
		
		
		
		
	}

}
