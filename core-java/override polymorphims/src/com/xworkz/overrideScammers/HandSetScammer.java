package com.xworkz.overrideScammers;

import com.xworkz.override.Headset;

public class HandSetScammer {

	public static void main(String[] args) {

		Headset headset=new Headset();
		Headset headset2=new Headset();
		
		System.out.println(headset.toString());
		headset.setBrand("reliance");
		System.out.println(headset.getBrand());
		String arg=headset.toString();
		System.out.println(arg);
		
		System.out.println(headset.hashCode());
		System.out.println(headset.getBattery());
		int arg1=headset.hashCode();
		System.out.println(arg1);
		
		headset.setBrand("jio");
		headset2.setBrand("jio");
		System.out.println(headset.equals(headset2));
	}

}
