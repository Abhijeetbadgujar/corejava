package com.xworkz.extend;

import com.xworkz.extend.shop.GoldFish;
import com.xworkz.extend.shop.SharkFish;

public class FishStater {

	public static void main(String[] args) {
		
		GoldFish goldFish=new GoldFish();
		SharkFish sharkFish=new SharkFish();
	
		System.out.println("in main:"+sharkFish.height);
		System.out.println("in main:"+sharkFish.weight);
	
		System.out.println("Shark fish colour: "+goldFish.colour);
		System.out.println("Shark fish size: "+goldFish.size);
	
	}
	
}
