package com.xworkz.overrideScammers;

import com.xworkz.override.Tyre;
import com.xworkz.override.TyreType;

public class TyreScammer {

	public static void main(String[] args) {

		Tyre tyre=new Tyre();
		Tyre tyre1=new Tyre();
		System.out.println(tyre.toString());
		
		System.out.println(tyre.hashCode());
		
		tyre.setType(TyreType.RADIAL);
		tyre1.setType(TyreType.RADIAL);
		System.out.println(tyre.equals(tyre1));
	}

}
