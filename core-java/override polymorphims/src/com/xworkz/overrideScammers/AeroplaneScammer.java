package com.xworkz.overrideScammers;

import com.xworkz.override.Aeroplane;

public class AeroplaneScammer {

	public static void main(String[] args) {

		Aeroplane aeroplane=new Aeroplane();
		Aeroplane aeroplane1=new Aeroplane();
		
		System.out.println(aeroplane.toString());
		
		System.out.println(aeroplane.hashCode());
		//aeroplane1=null;
		aeroplane.setCompany("cargo");
		aeroplane1.setCompany("cargo");
		System.out.println(aeroplane.equals(aeroplane1));
	}

}
