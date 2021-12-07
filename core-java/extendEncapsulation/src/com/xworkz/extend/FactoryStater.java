package com.xworkz.extend;

import com.xworkz.extend.shop.Factory;
import com.xworkz.extend.shop.SugarFactory;

public class FactoryStater {

	public static void main(String[] args) {
		
		SugarFactory sugarFactory=new SugarFactory();
		sugarFactory=new SugarFactory();
		sugarFactory=new SugarFactory(2019);
		Factory factory=new Factory(2010);
		
		//Factory sugarFactory1=new SugarFactory();
		
	}

}
