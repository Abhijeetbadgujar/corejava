package com.xworkz.overrideScammers;

import com.xworkz.override.Shoe;

public class ShoeScammer {

	public static void main(String[] args) {

		Shoe shoe=new Shoe();
		Shoe shoe1=new Shoe();
		
		System.out.println(shoe.toString());
		
		System.out.println(shoe.hashCode());
		
		shoe.setColour("red");
		shoe1.setColour("red");
		System.out.println(shoe.equals(shoe1));
	}

}
