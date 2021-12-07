package com.xworkz.extend.shop;

public class SharkFish {
	/*public float height=12.4f;
	public float weight=14.3f;
	
	public SharkFish() {
		this(24.8f,10.3f);
		System.out.println("invoked the GoldFish");
		
	}
	public SharkFish() {
		//super();
		System.out.println("gold fish height :"+height);
		System.out.println("gold fish weight :"+weight);
		
	}*/
	
	
	
	
	
	
	
	public float height=15.4f;
	public float weight=3.4f;
	
	
	public SharkFish() {
		this(14.4f,2.3f);
		System.out.println("invoked the no-paramerterized constructor");
	}
	public SharkFish(float height,float weight) {
		super();
		System.out.println("Shark fish height: "+height);
		System.out.println("Shark fish weight: "+weight);
	}
	
}
