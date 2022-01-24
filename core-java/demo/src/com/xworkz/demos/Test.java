package com.xworkz.demos;

import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {	
//		String str = "This is Abhi This is Abhi badgujar";
//		This 2
//		is  2
//		Abhi 2
//		badgujar 1
		String string;
		String name = "This is Abhi This is Abhi badgujar";
		Map<String,Integer> map=new TreeMap<String,Integer>();
		String charArray[]=name.split(" ");
		for(String letter :charArray) {
			
			if(map.containsKey(letter){
				Integer value=map.get(charArray);
				value++;
				map.put(letter, value);
			}
			else {
				System.out.println();
			}
		}
		System.out.println(map);
	
}
}
