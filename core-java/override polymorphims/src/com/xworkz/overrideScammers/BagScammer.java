package com.xworkz.overrideScammers;

import com.xworkz.override.Bag;
import com.xworkz.override.ColourBag;

public class BagScammer {

	public static void main(String[] args) {

		Bag bag=new Bag();
		Bag bag1=new Bag();
		
		System.out.println(bag.toString());

/*@Override
Returns a string representation of the object. In general, the toString method returns a string that"textually represents" this object. The result shouldbe a concise but informative representation that is easy for aperson to read.It is recommended that all subclasses override this method. 

The toString method for class Objectreturns a string consisting of the name of the class of which theobject is an instance, the at-sign character `@', andthe unsigned hexadecimal representation of the hash code of theobject. In other words, this method returns a string equal to thevalue of: 

 getClass().getName() + '@' + Integer.toHexString(hashCode())*/
	
		System.out.println(bag.hashCode());
		
		bag.setColour(ColourBag.RED);
		bag1.setColour(ColourBag.RED);
		System.out.println(bag.equals(bag1));
	
	
	
	}
	

}
