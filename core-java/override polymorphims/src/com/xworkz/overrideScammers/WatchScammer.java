package com.xworkz.overrideScammers;

import com.xworkz.override.Type;
import com.xworkz.override.Watch;

public class WatchScammer {

	public static void main(String[] args) {

		Watch watch=new Watch();
		Watch watch1=new Watch();
		
		System.out.println(watch.toString());
		String ref=watch.toString();
		System.out.println(ref);
		
		System.out.println(watch.hashCode());
		int ref1=watch.hashCode();
		System.out.println(ref1);
		
		watch.setBrand("gucchi");
		watch1.setBrand("gucchi");
		watch.setType(Type.DIGITAL);
		watch1.setType(Type.DIGITAL);
		System.out.println(watch.equals(watch1));
	}

}
