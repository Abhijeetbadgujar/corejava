package com.xworkz.overrideScammers;

import com.xworkz.override.Stadium;

public class StadiumScammer {

	public static void main(String[] args) {

		Stadium stadium=new Stadium();
		Stadium stadium1=new Stadium();
		
		System.out.println(stadium.toString());
		
		System.out.println(stadium.hashCode());
		
		stadium.setCity("pune");
		
	    stadium1.setCity("pune");
		System.out.println(stadium.equals(stadium1));
	}

}
