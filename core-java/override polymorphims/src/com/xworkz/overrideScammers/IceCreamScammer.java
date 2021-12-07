package com.xworkz.overrideScammers;

import com.xworkz.override.Flaour;
import com.xworkz.override.IceCream;
import com.xworkz.override.TypeIce;

public class IceCreamScammer {

	public static void main(String[] args) {

		IceCream cream=new IceCream();
		IceCream cream1=new IceCream();
		
		System.out.println(cream.toString());
		
		System.out.println(cream.hashCode());
		
		cream.setFlaour(Flaour.VINELA);
		cream1.setFlaour(Flaour.VINELA);
		cream.setType(TypeIce.BURNCHOCALATE);
		cream1.setType(TypeIce.BURNCHOCALATE);
		System.out.println(cream.equals(cream1));
	}

}
