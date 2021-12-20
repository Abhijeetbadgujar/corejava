package com.xworkz.methods.loopList;

import java.util.ArrayList;
import java.util.List;

public class LoopListScanner {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("abhi");
		list.add("thrishul");
		list.add("mallik");
		list.add("sheyas");
		list.add("mustak");
		list.add("teju");
		list.add("shangita");
		list.add("mustaq");
		list.add("versha");
		list.add("savita");
		
		for(String element:list) {
			System.out.println(element);
		}
		System.err.println("--------------------");
		list.forEach((f)->{System.out.println(f);});

	}

}
