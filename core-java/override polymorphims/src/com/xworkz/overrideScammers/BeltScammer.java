package com.xworkz.overrideScammers;

import com.xworkz.override.Belt;

public class BeltScammer {

	public static void main(String[] args) {

		Belt belt=new Belt();
		Belt belt2=new Belt();
		
		System.out.println(belt.hashCode());
		
		System.out.println(belt.toString());
		
		belt.setMaterial("lader");
		belt2.setMaterial("lader");
		System.out.println(belt.equals(belt2));
		
	}

}
