package com.xworkz.access.ArrayStater;

import com.xworkz.access.BeachOperator;

public class BeachNameStater {

	public static void main(String[] args) {
		
		BeachOperator beachoperator=new BeachOperator();
		
		String cname=beachoperator.getCountry();
		System.out.println(cname);
		
		//beachoperator.addBeachName("on beach");
		
		//beachoperator.displayBeachName();
		
		beachoperator.addBeachName("waga");
		beachoperator.addBeachName("waga1");
		beachoperator.addBeachName("waga2");
		beachoperator.addBeachName("waga3");
		beachoperator.displayBeachName();
		
		
	}

}
