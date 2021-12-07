package com.xworkz.overrideScammers;

import com.xworkz.override.Fish;

public class FishScammer {

	public static void main(String[] args) {

		Fish fish=new Fish();
		Fish fish1=new Fish();
		
		
		System.out.println(fish.hashCode());
		
		System.out.println(fish.toString());
		
		fish.setColour("Black");
		fish1.setColour("Black");
		fish.setName("Shark");
		fish1.setName("Shark");
		System.out.println(fish.equals(fish1));
	}

}
