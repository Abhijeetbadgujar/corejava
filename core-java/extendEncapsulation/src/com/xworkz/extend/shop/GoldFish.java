package com.xworkz.extend.shop;

public class GoldFish extends SharkFish {
	/*public String colour;
	public String size;
	
	public GoldFish(String colour,String size) {
		System.out.println("Gold fish colour: "+colour);
		System.out.println("Gold fish size"+size);
	}

	public GoldFish() {
		// TODO Auto-generated constructor stub
	}*/
	
	public String colour="red";
	public String size="small";
	
	public GoldFish() {
		
		this("golden","small");
		System.out.println("invoked the GoldFish");
	}
	
	public GoldFish(String colour,String size) {	
		System.out.println("Gold Fish colour: ".concat(colour));
		System.out.println("Gold Fish size: ".concat(size));
	}
	
	
}
